package com.ssafy.snapfit.controller;

import java.util.List;

<<<<<<< HEAD
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.snapfit.model.dto.Follow;
import com.ssafy.snapfit.model.dto.Member;
import com.ssafy.snapfit.service.FollowService;

@RestController
public class FollowController {
	
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.snapfit.model.dto.Member;
import com.ssafy.snapfit.service.FollowService;
import com.ssafy.snapfit.service.MemberService;

@RestController
@RequestMapping("/follow")
public class FollowController {
	
	@Autowired
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
	private final FollowService followService;
	
	public FollowController(FollowService followService) {
		this.followService = followService;
	}
	
<<<<<<< HEAD
	// 1. 특정 유저"가" 팔로우하는 모든 사람들을 조회하기(가져오기) 즉, 특정 유저의 팔로잉 리스트 조회하기(가져오기)
	@GetMapping("/follow/following/{memberNo}")
	public ResponseEntity<List<Member>> findAllFollowing(@PathVariable("memberNo") long memberNo) {
		
		List<Member> list = followService.findAllFollowingMembers(memberNo);
		
		if (list == null || list.size() == 0) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(list, HttpStatus.OK);
		
	}
	
	// 2. 특정 유저"를" 팔로우하는 모든 사람들을 조회하기(가져오기) 즉, 특정 유저의 팔로워 리스트 조회하기(가져오기)
	@GetMapping("/follow/follower/{memberNo}")
	public ResponseEntity<List<Member>> findAllFollower(@PathVariable("memberNo") long memberNo) {
		
		List<Member> list = followService.findAllFollowerMembers(memberNo);
		
		if (list == null || list.size() == 0) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(list, HttpStatus.OK);
		
	}
	
	// 3. 주어진 팔로우 관계가 DB에 존재하는지 판단하기 (존재하면 true + OK, 존재하지 않으면 false + NO_CONTENT)
	@GetMapping("/follow")
	public ResponseEntity<Boolean> check(@ModelAttribute Follow follow) {
		if (followService.checkFollow(follow)) {
			return new ResponseEntity<>(true, HttpStatus.OK);
		}
		
		return new ResponseEntity<>(false, HttpStatus.NO_CONTENT);
		
	}
	
	// 4. 팔로우라는 "관계"를 등록하기(삽입하기) 단, 이미 등록된 관계라면 삽입하지 않는다.
	@PostMapping("/follow")
	public ResponseEntity<Boolean> add(@RequestBody Follow follow) {
		
		if (followService.addFollow(follow)) {
			return new ResponseEntity<>(true, HttpStatus.CREATED);
		}
		
		return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
		
	}
	
	// 5. 팔로우라는 "관계"를 삭제하기
	@DeleteMapping("/follow")
	public ResponseEntity<Boolean> remove(@RequestBody Follow follow) {
		
		System.out.println(follow);
		
		if (followService.removeFollow(follow)) {
			return new ResponseEntity<>(true, HttpStatus.OK);
		}
		
		return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
		
=======
	@GetMapping("/following/{no}")
	public ResponseEntity<?> getFollowing(@PathVariable long no) {

		List<Member> followingList = followService.getFollowings(no);
		if(followingList == null || followingList.size() == 0) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Member>>(followingList, HttpStatus.OK);
	
	}
	
	@GetMapping("/follower/{no}")
	public ResponseEntity<?> getFollower(@PathVariable long no) {

		List<Member> followerList = followService.getFollowers(no);
		if(followerList == null || followerList.size() == 0) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Member>>(followerList, HttpStatus.OK);
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
	}

}
