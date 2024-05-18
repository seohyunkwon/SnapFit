package com.ssafy.snapfit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.snapfit.model.dto.LikeComment;
import com.ssafy.snapfit.model.dto.LikeVideo;
import com.ssafy.snapfit.service.LikeCommentService;
import com.ssafy.snapfit.service.LikeVideoService;

@RestController
@RequestMapping("/like")
public class LikeController {
	
	private final LikeVideoService likeVideoService;
	private final LikeCommentService likeCommentService;
	
	public LikeController(LikeVideoService likeVideoService, LikeCommentService likeCommentService) {
		this.likeVideoService = likeVideoService;
		this.likeCommentService = likeCommentService;
	}
	
	// 영상 좋아요

	@PostMapping("/video")
	public ResponseEntity<?> addLikeVideo(@RequestBody LikeVideo likeVideo) {
		long videoNo = likeVideo.getVideoNo();
		long memberNo = likeVideo.getMemberNo();
		if(!likeVideoService.isLiked(videoNo, memberNo) && likeVideoService.addLikeVideo(likeVideo)) {
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
		
		return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		
	}
	
	@DeleteMapping("/video")
	public ResponseEntity<?> deleteLikeVideo(@RequestBody LikeVideo likeVideo) {
		if(likeVideoService.addLikeVideo(likeVideo)) {
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/video/{videoNo}/{memberNo}")
	public ResponseEntity<?> isExistLikeVideo(@PathVariable("videoNo") long videoNo, @PathVariable("memberNo") long memberNo) {
		if(likeVideoService.isLiked(videoNo, memberNo)) {
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	
	// 댓글 좋아요
	
	@PostMapping("/comment")
	public ResponseEntity<?> addLikeComment(@RequestBody LikeComment likeComment) {
		long commentNo = likeComment.getCommentNo();
		long memberNo = likeComment.getMemberNo();
		if(!likeCommentService.isLiked(commentNo, memberNo) && likeCommentService.addLikeComment(likeComment)) {
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
		
		return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		
	}
	
	@DeleteMapping("/comment")
	public ResponseEntity<?> deleteLikeComment(@RequestBody LikeComment likeComment) {
		if(likeCommentService.addLikeComment(likeComment)) {
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/comment/{commentNo}/{memberNo}")
	public ResponseEntity<?> isExistLikeComment(@PathVariable("commentNo") long commentNo, @PathVariable("memberNo") long memberNo) {
		if(likeCommentService.isLiked(commentNo, memberNo)) {
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	

}
