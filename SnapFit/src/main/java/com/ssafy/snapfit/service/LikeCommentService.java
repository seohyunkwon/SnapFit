package com.ssafy.snapfit.service;

import com.ssafy.snapfit.model.dto.LikeComment;

public interface LikeCommentService {
	
	// 좋아요 생성
	boolean addLikeComment(LikeComment likeComment);
	
	// 좋아요 삭제
	boolean removeLikeComment(LikeComment likeComment);
	
	// 좋아요 여부 확인
	boolean isLiked(long commentNo, long memberNo);
	
}
