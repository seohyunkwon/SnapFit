package com.ssafy.snapfit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.snapfit.model.dto.Member;
import com.ssafy.snapfit.security.JwtUtil;
import com.ssafy.snapfit.service.MemberService;

@RestController
public class MemberController {

	private final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	private final MemberService memberService;

	private final AuthenticationManagerBuilder authenticationManagerBuilder;

	@Autowired
	private final JwtUtil jwtUtil;

	public MemberController(MemberService memberService, AuthenticationManagerBuilder authenticationManagerBuilder,
			JwtUtil jwtUtil) {
		this.memberService = memberService;
		this.authenticationManagerBuilder = authenticationManagerBuilder;
		this.jwtUtil = jwtUtil;
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

	@GetMapping("/member/{id}")
	public ResponseEntity<?> getMemberById(@PathVariable String id) {
		Member member = memberService.findMemberById(id);
		if (member == null) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Member>(member, HttpStatus.OK);
	}
	
	@GetMapping("/member/{no}")
	public ResponseEntity<?> getMemberByNo(@PathVariable long no) {
		Member member = memberService.findMemberByNo(no);
		if (member == null) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Member>(member, HttpStatus.OK);
	}

	@PutMapping("/member/{no}")
	public ResponseEntity<?> modify(@PathVariable long no, @RequestBody Member member) {
		if(memberService.modifyMember(no, member)) {
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
	}
	
	@DeleteMapping("/member/{no}")
	public ResponseEntity<?> remove(@PathVariable long no) {
		if(memberService.removeMember(no)) {
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
	}
}
