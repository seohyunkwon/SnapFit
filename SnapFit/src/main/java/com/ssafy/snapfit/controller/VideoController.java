package com.ssafy.snapfit.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.snapfit.model.dto.SearchCondition;
import com.ssafy.snapfit.model.dto.Video;
import com.ssafy.snapfit.service.VideoService;

@RestController
public class VideoController {
	
	private final VideoService videoService;
	
	public VideoController(VideoService videoService) {
		this.videoService = videoService;
	}
	
	// 1-1. 전체 영상 조회하기(가져오기)
	@GetMapping("/video")
	public ResponseEntity<List<Video>> findAll() {
		
		List<Video> list = videoService.findAllVideos();
		
		if (list == null || list.size() == 0) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(list, HttpStatus.OK);
		
	}
	
	// 1-2. 전체 영상 중에서 검색해서 조회하기(가져오기)
	@GetMapping("/video/search")
	public ResponseEntity<List<Video>> search(@ModelAttribute SearchCondition sc) {
		
		List<Video> list = videoService.searchVideos(sc);
		
		if (list == null || list.size() == 0) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(list, HttpStatus.OK);
		
	}
	
	// 1-3. 전체 영상 단위에서 하나의 영상 등록하기(삽입하기)
	@PostMapping("/video")
	public ResponseEntity<Boolean> add(@RequestBody Video video) {
		
		if (videoService.addVideo(video)) {
			return new ResponseEntity<>(true, HttpStatus.CREATED);
		}
		
		return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
		
	}

	// 1-4. 전체 영상 단위에서 PK로 특정 영상 삭제하기 (수정 기능은 X)
	@DeleteMapping("/video/{id}")
	public ResponseEntity<Boolean> remove(@PathVariable("id") long videoNo) {
		
		if (videoService.removeVideo(videoNo)) {
			return new ResponseEntity<>(true, HttpStatus.OK);
		}
		
		return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
		
	}
	
	// 2. 특정 유저가 팔로잉하는 사람들의 모든 영상 조회하기(가져오기)
	@GetMapping("/video/follow/{id}")
	public ResponseEntity<List<Video>> findAllFollowing(@PathVariable("id") long memberNo) {
		
		List<Video> list = videoService.findAllFollowingVideos(memberNo);
		
		if (list == null || list.size() == 0) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(list, HttpStatus.OK);
		
	}
	
}
