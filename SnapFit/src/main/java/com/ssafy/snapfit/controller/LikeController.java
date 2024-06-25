package com.ssafy.snapfit.controller;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
=======
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.snapfit.model.dto.LikeComment;
import com.ssafy.snapfit.model.dto.LikeVideo;
<<<<<<< HEAD
import com.ssafy.snapfit.service.LikeService;
=======
import com.ssafy.snapfit.service.LikeCommentService;
import com.ssafy.snapfit.service.LikeVideoService;
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9

@RestController
@RequestMapping("/like")
public class LikeController {
	
<<<<<<< HEAD
	private final LikeService likeService;
	
	public LikeController(LikeService likeService) {
		this.likeService = likeService;
	}
	
	// 1-1. 특정 유저가 특정 영상을 좋아요 했는지에 대한 정보가 DB에 존재하는지 판단하기 (존재하면 true + OK, 존재하지 않으면 false + NO_CONTENT)
	@GetMapping("/video")
	public ResponseEntity<?> checkVideo(@ModelAttribute LikeVideo likeVideo) {
		// 1-4. 특정 영상에 따른 like 리스트 반환
		if(likeVideo.getMemberNo() == 0) {
			List<LikeVideo> list = likeService.findVideoLikeByVideoNo(likeVideo.getVideoNo());
			if(list.size() == 0) {
				return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<List<LikeVideo>>(list, HttpStatus.OK);
		}
		
		if (likeService.checkVideoLike(likeVideo)) {
			return new ResponseEntity<>(true, HttpStatus.OK);
		}
		
		return new ResponseEntity<>(false, HttpStatus.NO_CONTENT);
		
	}
	
	// 1-2. 특정 유저가 특정 영상을 좋아요 했다는 정보를 등록하기(삽입하기) 단, 이미 등록된 관계라면 삽입하지 않는다.
	@PostMapping("/video")
	public ResponseEntity<Boolean> addVideo(@RequestBody LikeVideo likeVideo) {
		
		if (likeService.addVideoLike(likeVideo)) {
			return new ResponseEntity<>(true, HttpStatus.CREATED);
		}
		
		return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
		
	}
	
	// 1-3. 특정 유저가 특정 영상을 좋아요 했다는 정보를 삭제하기
	@DeleteMapping("/video")
	public ResponseEntity<Boolean> removeVideo(@RequestBody LikeVideo likeVideo) {
		
		if (likeService.removeVideoLike(likeVideo)) {
			return new ResponseEntity<>(true, HttpStatus.OK);
		}
		
		return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
		
	}

	
	// 2-1. 특정 유저가 특정 댓글을 좋아요 했는지에 대한 정보가 DB에 존재하는지 판단하기 (존재하면 true + OK, 존재하지 않으면 false + NO_CONTENT)
	@GetMapping("/comment")
	public ResponseEntity<Boolean> checkComment(@ModelAttribute LikeComment likeComment) {
		
		if (likeService.checkCommentLike(likeComment)) {
			return new ResponseEntity<>(true, HttpStatus.OK);
		}
		
		return new ResponseEntity<>(false, HttpStatus.NO_CONTENT);
		
	}
	
	// 2-2. 특정 유저가 특정 댓글을 좋아요 했다는 정보를 등록하기(삽입하기) 단, 이미 등록된 관계라면 삽입하지 않는다.
	@PostMapping("/comment")
	public ResponseEntity<Boolean> addComment(@RequestBody LikeComment likeComment) {
		
		if (likeService.addCommentLike(likeComment)) {
			return new ResponseEntity<>(true, HttpStatus.CREATED);
		}
		
		return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
		
	}
	
	// 2-3. 특정 유저가 특정 댓글을 좋아요 했다는 정보를 삭제하기
	@DeleteMapping("/comment")
	public ResponseEntity<Boolean> removeComment(@RequestBody LikeComment likeComment) {
		
		if (likeService.removeCommentLike(likeComment)) {
			return new ResponseEntity<>(true, HttpStatus.OK);
		}
		
		return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
		
	}
=======
	private final LikeVideoService likeVideoService;
	private final LikeCommentService likeCommentService;
	
	public LikeController(LikeVideoService likeVideoService, LikeCommentService likeCommentService) {
		this.likeVideoService = likeVideoService;
		this.likeCommentService = likeCommentService;
	}
	
	// 영상 좋아요

	@PostMapping("/video/{videoNo}/{memberNo}")
	public ResponseEntity<?> addLikeVideo(@RequestBody LikeVideo likeVideo) {
		
		if(!likeVideoService.isLiked(likeVideo) && likeVideoService.addLikeVideo(likeVideo)) {
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
		
		return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		
	}
	
	@DeleteMapping("/video/{videoNo}/{memberNo}")
	public ResponseEntity<?> deleteLikeVideo(@RequestBody LikeVideo likeVideo) {
		if(likeVideoService.addLikeVideo(likeVideo)) {
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
		return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/video/{videoNo}/{memberNo}")
	public ResponseEntity<?> isExistLikeVideo(@RequestBody LikeVideo likeVideo) {
		System.out.println(likeVideo);
		if(likeVideoService.isLiked(likeVideo)) {
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	
	// 댓글 좋아요
	
	@PostMapping("/comment/{commentNo}/{memberNo}")
	public ResponseEntity<?> addLikeComment(@RequestBody LikeComment likeComment) {
		
		if(!likeCommentService.isLiked(likeComment) && likeCommentService.addLikeComment(likeComment)) {
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
		
		return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		
	}
	
	@DeleteMapping("/comment/{commentNo}/{memberNo}")
	public ResponseEntity<?> deleteLikeComment(@RequestBody LikeComment likeComment) {
		if(likeCommentService.addLikeComment(likeComment)) {
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
		return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/comment/{commentNo}/{memberNo}")
	public ResponseEntity<?> isExistLikeComment(@RequestBody LikeComment likeComment) {
		if(likeCommentService.isLiked(likeComment)) {
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9

}
