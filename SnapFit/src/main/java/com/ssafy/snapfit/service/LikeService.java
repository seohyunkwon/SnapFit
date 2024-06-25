package com.ssafy.snapfit.service;

import java.util.List;

import com.ssafy.snapfit.model.dto.LikeComment;
import com.ssafy.snapfit.model.dto.LikeVideo;

public interface LikeService {
	
	// 1-1. 특정 유저가 특정 영상을 좋아요 했는지에 대한 정보가 DB에 존재하는지 판단하기
	boolean checkVideoLike(LikeVideo likeVideo);
	
	// 1-2. 특정 유저가 특정 영상을 좋아요 했다는 정보를 등록하기(삽입하기) 단, 이미 등록된 관계라면 삽입하지 않는다.
	boolean addVideoLike(LikeVideo likeVideo);
	
	// 1-3. 특정 유저가 특정 영상을 좋아요 했다는 정보를 삭제하기
	boolean removeVideoLike(LikeVideo likeVideo);
	
	// 1-4. 특정 영상에 대한 좋아요 목록 가져오기
	List<LikeVideo> findVideoLikeByVideoNo(long videoNo);
	
	// 2-1. 특정 유저가 특정 댓글을 좋아요 했는지에 대한 정보가 DB에 존재하는지 판단하기
	boolean checkCommentLike(LikeComment likeComment);
	
	// 2-2. 특정 유저가 특정 댓글을 좋아요 했다는 정보를 등록하기(삽입하기) 단, 이미 등록된 관계라면 삽입하지 않는다.
	boolean addCommentLike(LikeComment likeComment);
	
	// 2-3. 특정 유저가 특정 댓글을 좋아요 했다는 정보를 삭제하기
	boolean removeCommentLike(LikeComment likeComment);
	
}
