package com.ssafy.snapfit.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ssafy.snapfit.model.dto.Member;
import com.ssafy.snapfit.model.dto.SearchCondition;
import com.ssafy.snapfit.security.JwtUtil;
import com.ssafy.snapfit.security.KakaoService;
import com.ssafy.snapfit.service.MemberService;

@RestController
@CrossOrigin
public class MemberController {
	
	@Value("${file.upload-dir}")
	private String uploadDir;

	private final Logger logger = LoggerFactory.getLogger(MemberController.class);

	private final MemberService memberService;

	private final AuthenticationManagerBuilder authenticationManagerBuilder;

	private final JwtUtil jwtUtil;

	private final KakaoService kakaoService;

	public MemberController(MemberService memberService,
			AuthenticationManagerBuilder authenticationManagerBuilder, JwtUtil jwtUtil, KakaoService kakaoService) {
		this.memberService = memberService;
		this.authenticationManagerBuilder = authenticationManagerBuilder;
		this.jwtUtil = jwtUtil;
		this.kakaoService = kakaoService;
	}

	@PostMapping("/signup")
	public ResponseEntity<?> signup(@RequestBody Member member) {
		if (memberService.signup(member)) {
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}

		return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Member member) {
		
		UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
				member.getId(), member.getPassword());
		Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);

		String token = jwtUtil.createToken(member);
		
		return ResponseEntity.ok().body(token);
	}

	@PostMapping("/member")
	public ResponseEntity<?> findMember(@RequestBody SearchCondition sc) {
		Member member = memberService.findMember(sc);
		if (member == null) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Member>(member, HttpStatus.OK);
	}


	@PutMapping(value = "/member/{no}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> modify(@PathVariable("no") long no, 
			@RequestParam("nickname") String nickname,
			@RequestParam(value="password", required = false) String password,
			@RequestPart(value="file", required = false) MultipartFile file) throws IllegalStateException, IOException {

		Member member = new Member();
		member.setNickname(nickname);
		member.setPassword(password);
		member.setProfileSrc("member_"+no+".png");
		
		if(memberService.modifyMember(no, member)) {
			
			String filePath = uploadDir + "\\member\\member_" + no + ".png";
			
			System.out.println("filePath = " + filePath);
			try {
				file.transferTo(new File(filePath));
				member.setProfileSrc("member_"+no+".png");
			} catch (IOException e) {
				e.printStackTrace();
				return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
			}
			
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
	}
	
	@DeleteMapping("/member/{no}")
	public ResponseEntity<?> remove(@PathVariable("no") long no) {
		if(memberService.removeMember(no)) {
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/member/recommend")
	public ResponseEntity<?> recommend(@RequestParam("memberNo") long memberNo) {
		System.out.println("memberNo = "+ memberNo);
		List<Member> recommend_list = memberService.findRecommendMember(memberNo);
		System.out.println("recommend_list = " + recommend_list);
		if(recommend_list.size() == 0) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Member>>(recommend_list, HttpStatus.OK);
	}
	
	@GetMapping("/kakao/oauth")
	public ResponseEntity<?> kakao(@RequestParam String code) throws IOException, InterruptedException {
		Member member = kakaoService.getKakaoMember(code);
		if(member == null) {
			return new ResponseEntity<Void>(HttpStatus.BAD_GATEWAY);
		}
		
		if(memberService.findMember(new SearchCondition("id", member.getId(), null, null)) == null) {
			memberService.signup(member);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
