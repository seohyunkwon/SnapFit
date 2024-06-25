package com.ssafy.snapfit.service;

import java.util.List;

import com.ssafy.snapfit.model.dto.Comment;
import com.ssafy.snapfit.model.dto.SearchCondition;

public interface CommentService {
	
	// 1-1. 특정 영상에 대해 좋아요 또는 최신순으로 모든 댓글 조회하기(가져오기)
	List<Comment> findAllComments(long videoNo, SearchCondition sc, long loginNo);
	
	// 1-2. 특정 영상에 대해 하나의 댓글 등록하기(삽입하기)
	Boolean addComment(Comment comment);
	
	// 1-3. 특정 영상에 대해 하나의 댓글 수정하기
	Boolean modifyComment(Comment comment);
	
	// 1-4. 특정 영상에 대해 하나의 댓글 PK로 삭제하기
	Boolean removeComment(long commentNo);
	
	// 2. 특정 유저가 작성한 모든 댓글들을 최신순으로 조회하기(가져오기)
	List<Comment> findAllCommentsWrittenByMember(long memberNo);

}
