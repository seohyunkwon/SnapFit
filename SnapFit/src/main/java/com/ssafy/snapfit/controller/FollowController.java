package com.ssafy.snapfit.controller;

import java.util.List;

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
	private final FollowService followService;
	
	public FollowController(FollowService followService) {
		this.followService = followService;
	}
	
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
	}

}
