package com.ssafy.snapfit.controller;

<<<<<<< HEAD
import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
=======
import java.util.List;

import org.springframework.http.HttpStatus;
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
=======
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9

import com.ssafy.snapfit.model.dto.SearchCondition;
import com.ssafy.snapfit.model.dto.Video;
import com.ssafy.snapfit.service.VideoService;

<<<<<<< HEAD
import io.jsonwebtoken.io.IOException;

@RestController
public class VideoController {
	
	@Value("${file.upload-dir}")
	private String uploadDir;
	
=======
@RestController
public class VideoController {
	
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
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
<<<<<<< HEAD
	@PostMapping(value = "/video", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<Boolean> add(
			@RequestParam("title") String title,
			@RequestParam("content") String content,
			@RequestParam("exercise_no") long exerciseNo,
			@RequestParam("uploader_no") long uploaderNo,
			@RequestPart("file") MultipartFile file) throws IllegalStateException, java.io.IOException {
		
		/** videoService.addVideo(video)가 반환하는 값은 등록이 실패했을 때는 정수 0, 등록이 성공했을 때는 그 데이터가 DB에 들어갔을 당시의 정수 PK 값이다.
		 * 그걸 이용해서 SnapFit의 동률의 위치에 존재하는 front-final/src/assets/videos/video_PK.mp4 파일로 저장되게 만들자.  */
		
		Video video = new Video(uploaderNo, exerciseNo, title, content);
		
		int PK_or_ZERO = videoService.addVideo(video);
				
		// 등록 실패했을 때
		if (PK_or_ZERO == 0) {
			return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
		}
		
		// 저장할 파일 경로 설정
		String filePath = uploadDir + "\\videos\\video_" + video.getNo() + ".mp4";
		
		// 파일 저장
		try {
			file.transferTo(new File(filePath));
		} catch (IOException e) {
			e.printStackTrace();
			return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<>(true, HttpStatus.CREATED);
=======
	@PostMapping("/video")
	public ResponseEntity<Boolean> add(@RequestBody Video video) {
		
		if (videoService.addVideo(video)) {
			return new ResponseEntity<>(true, HttpStatus.CREATED);
		}
		
		return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
		
	}

	// 1-4. 전체 영상 단위에서 PK로 특정 영상 삭제하기 (수정 기능은 X)
<<<<<<< HEAD
	@DeleteMapping("/video/{videoNo}")
	public ResponseEntity<Boolean> remove(@PathVariable("videoNo") long videoNo) {
=======
	@DeleteMapping("/video/{id}")
	public ResponseEntity<Boolean> remove(@PathVariable("id") long videoNo) {
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
		
		if (videoService.removeVideo(videoNo)) {
			return new ResponseEntity<>(true, HttpStatus.OK);
		}
		
		return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
		
	}
	
	// 2. 특정 유저가 팔로잉하는 사람들의 모든 영상 조회하기(가져오기)
<<<<<<< HEAD
	@GetMapping("/video/follow/{memberNo}")
	public ResponseEntity<List<Video>> findAllFollowing(@PathVariable("memberNo") long memberNo) {
=======
	@GetMapping("/video/follow/{id}")
	public ResponseEntity<List<Video>> findAllFollowing(@PathVariable("id") long memberNo) {
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
		
		List<Video> list = videoService.findAllFollowingVideos(memberNo);
		
		if (list == null || list.size() == 0) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(list, HttpStatus.OK);
		
	}
	
<<<<<<< HEAD
	// 3. 특정 유저가 좋아요 누른 영상들을 최신순으로 조회하기(가져오기)
	@GetMapping("/video/like/{memberNo}")
	public ResponseEntity<List<Video>> findAllLike(@PathVariable("memberNo") long memberNo) {
		
		List<Video> list = videoService.findAllLikeVideos(memberNo);
		
		if (list == null || list.size() == 0) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(list, HttpStatus.OK);
		
	}
	
	// 4. 특정 유저의 영상 가져오기
	@GetMapping("/video/member/{memberNo}")
public ResponseEntity<List<Video>> findAllUpload(@PathVariable("memberNo") long memberNo) {
		
		List<Video> list = videoService.findAllUploadVideos(memberNo);
		
		if (list == null || list.size() == 0) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(list, HttpStatus.OK);
		
	}
	
	// 5. 특정 영상의 모든 영상 가져오기
	@GetMapping("/video/exercise/{exerciseNo}")
	public ResponseEntity<List<Video>> findAllExercise(@PathVariable("exerciseNo") long exerciseNo) {
			System.out.println(exerciseNo);
			List<Video> list = videoService.findAllExerciseVideos(exerciseNo);
			System.out.println(list);
			
			if (list == null || list.size() == 0) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(list, HttpStatus.OK);
			
		}
		
	
=======
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
}
