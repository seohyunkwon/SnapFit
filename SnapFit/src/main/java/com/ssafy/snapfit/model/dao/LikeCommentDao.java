package com.ssafy.snapfit.model.dao;

import com.ssafy.snapfit.model.dto.LikeComment;

public interface LikeCommentDao {
	
	// 좋아요 생성
	int insertLikeComment(LikeComment likeComment);
	
	// 좋아요 삭제
	int deleteLikeComment(LikeComment likeComment);
	
	// 좋아요 여부 확인
	int countLikeComment(LikeComment likeComment);
}
