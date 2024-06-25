package com.ssafy.snapfit.model.dao;

import com.ssafy.snapfit.model.dto.LikeVideo;

public interface LikeVideoDao {
	
	// 좋아요 생성
	int insertLikeVideo(LikeVideo likeVideo);
	
	// 좋아요 삭제
	int deleteLikeVideo(LikeVideo likeVideo);
	
	// 좋아요 여부 확인
	int countLikeVideo(LikeVideo likeVideo);
}