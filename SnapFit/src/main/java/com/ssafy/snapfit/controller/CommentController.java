package com.ssafy.snapfit.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.snapfit.model.dto.Comment;
import com.ssafy.snapfit.model.dto.SearchCondition;
import com.ssafy.snapfit.service.CommentService;

@RestController
public class CommentController {
	
	private final CommentService commentService;
	
	public CommentController(CommentService commentService) {
		this.commentService = commentService;
	}
	
	// 1-1. 특정 영상에 대해 좋아요 또는 최신순으로 모든 댓글 조회하기(가져오기)
<<<<<<< HEAD
	@GetMapping("/comment/{videoNo}/{loginNo}")
	public ResponseEntity<List<Comment>> findAll(@PathVariable("videoNo") long videoNo, @ModelAttribute SearchCondition sc,
			@PathVariable("loginNo") long loginNo) {
		
		/** 이곳에서 SearchCondition은 단순히 정렬 조건을 위한 것 !
		정렬 조건만을 위한 DTO를 만드는 것은 자원 낭비이다. */
		System.out.println("videoNo = " + videoNo);
		System.out.println("sc = " + sc);
		List<Comment> list = commentService.findAllComments(videoNo, sc, loginNo);

		if (list == null || list.size() == 0) {

=======
	@GetMapping("/comment/{id}")
	public ResponseEntity<List<Comment>> findAll(@PathVariable("id") long videoNo, @ModelAttribute SearchCondition sc) {
		
		/** 이곳에서 SearchCondition은 단순히 정렬 조건을 위한 것 !
		정렬 조건만을 위한 DTO를 만드는 것은 자원 낭비이다. */
		
		List<Comment> list = commentService.findAllComments(videoNo, sc);
		
		if (list == null || list.size() == 0) {
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(list, HttpStatus.OK);
		
	}
	
	// 1-2. 특정 영상에 대해 하나의 댓글 등록하기(삽입하기)
<<<<<<< HEAD
	@PostMapping("/comment")
	public ResponseEntity<Boolean> add(@RequestBody Comment comment) {
		
		if (commentService.addComment(comment)) {
			return new ResponseEntity<>(true, HttpStatus.CREATED);
		}
		
		return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
		
	}
	
	// 1-3. 특정 영상에 대해 하나의 댓글 수정하기
	@PutMapping("/comment")
	public ResponseEntity<Boolean> modify(@RequestBody Comment comment) {
		
		if (commentService.modifyComment(comment)) {
			return new ResponseEntity<>(true, HttpStatus.OK);
		}
		
		return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
		
	}
	
	// 1-4. 특정 영상에 대해 하나의 댓글 PK로 삭제하기
	@DeleteMapping("/comment/{commentNo}")
	public ResponseEntity<Boolean> remove(@PathVariable("commentNo") long commentNo) {
		
		if (commentService.removeComment(commentNo)) {
			return new ResponseEntity<>(true, HttpStatus.OK);
		}
		
		return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
		
	}
	
	// 2. 특정 유저가 작성한 모든 댓글들을 최신순으로 조회하기(가져오기)
	@GetMapping("/comment/member/{memberNo}")
	public ResponseEntity<List<Comment>> findAllWrittenByMember(@PathVariable("memberNo") long memberNo) {
		
		List<Comment> list = commentService.findAllCommentsWrittenByMember(memberNo);
		
		if (list == null || list.size() == 0) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(list, HttpStatus.OK);
		
	}
	
=======
	
	// 1-3. 특정 영상에 대해 하나의 댓글 수정하기
	
	// 1-4. 특정 영상에 대해 하나의 댓글 PK로 삭제하기

>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
}
