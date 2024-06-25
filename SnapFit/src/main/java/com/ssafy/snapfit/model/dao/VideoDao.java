package com.ssafy.snapfit.model.dao;

import java.util.List;

import com.ssafy.snapfit.model.dto.SearchCondition;
import com.ssafy.snapfit.model.dto.Video;

public interface VideoDao {

	// 1-1. 전체 영상 조회하기(가져오기)
	List<Video> selectAllVideos();
	
	// 1-2. 전체 영상 중에서 검색해서 조회하기(가져오기)
	List<Video> searchVideos(SearchCondition sc);
	
	// 1-3. 전체 영상 단위에서 하나의 영상 등록하기(삽입하기)
	int insertVideo(Video video);
	
	// 1-4. 전체 영상 단위에서 PK로 특정 영상 삭제하기 (수정 기능은 X)
	int deleteVideo(long videoNo);
	
	// 2. 특정 유저가 팔로잉하는 사람들의 모든 영상 조회하기(가져오기)
	List<Video> selectAllFollowingVideos(long memberNo);
	
<<<<<<< HEAD
	// 3. 특정 유저가 좋아요 누른 영상들을 최신순으로 조회하기(가져오기)
	List<Video> selectAllLikeVideos(long memberNo);
	
	// 4. 특정 유저가 올린 영상 가져오기
	List<Video> selectAllUploadVideos(long memberNo);
	
	// 5. 특정 영상의 모든 영상 가져오기
	List<Video> selectAllExerciseVideo(long exerciseNo);
	
=======
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
}
