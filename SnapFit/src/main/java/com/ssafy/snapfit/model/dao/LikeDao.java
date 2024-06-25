package com.ssafy.snapfit.model.dao;

import java.util.List;

import com.ssafy.snapfit.model.dto.LikeComment;
import com.ssafy.snapfit.model.dto.LikeVideo;

public interface LikeDao {
	
	// 1-1. 특정 유저가 특정 영상을 좋아요 했는지에 대한 정보가 DB에 존재하는지 판단하기
	// 입력된 정보가 Like_Video table에 존재하면 해당 정보를 반환하고, 존재하지 않으면 null을 반환한다.
	// && 	// 1-4. 특정 영상에 따른 좋아요 리스트 가져오기
	List<LikeVideo> selectVideoLike(LikeVideo likeVideo);
	
	// 1-2. 특정 유저가 특정 영상을 좋아요 했다는 정보를 등록하기(삽입하기)
	int insertVideoLike(LikeVideo likeVideo);
	
	// 1-3. 특정 유저가 특정 영상을 좋아요 했다는 정보를 삭제하기
	int deleteVideoLike(LikeVideo likeVideo);
	
	// 2-1. 특정 유저가 특정 댓글을 좋아요 했는지에 대한 정보가 DB에 존재하는지 판단하기
	// 입력된 정보가 Like_Comment table에 존재하면 해당 정보를 반환하고, 존재하지 않으면 null을 반환한다.
	LikeComment checkCommentLike(LikeComment likeComment);
	
	// 2-2. 특정 유저가 특정 댓글을 좋아요 했다는 정보를 등록하기(삽입하기)
	int insertCommentLike(LikeComment likeComment);
	
	// 2-3. 특정 유저가 특정 댓글을 좋아요 했다는 정보를 삭제하기
	int deleteCommentLike(LikeComment likeComment);

}
