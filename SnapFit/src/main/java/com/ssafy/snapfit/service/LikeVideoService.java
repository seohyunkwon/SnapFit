package com.ssafy.snapfit.service;

import com.ssafy.snapfit.model.dto.LikeVideo;

public interface LikeVideoService {
	
	// 좋아요 생성
	boolean addLikeVideo(LikeVideo likeVideo);
	
	// 좋아요 삭제
	boolean removeLikeVideo(LikeVideo likeVideo);
	
	// 좋아요 여부 확인
	boolean isLiked(long videoNo, long memberNo);
	
}
