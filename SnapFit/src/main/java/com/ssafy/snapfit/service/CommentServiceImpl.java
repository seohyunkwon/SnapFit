package com.ssafy.snapfit.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ssafy.snapfit.model.dao.CommentDao;
import com.ssafy.snapfit.model.dao.LikeDao;
import com.ssafy.snapfit.model.dao.MemberDao;
import com.ssafy.snapfit.model.dto.Comment;
import com.ssafy.snapfit.model.dto.LikeComment;
import com.ssafy.snapfit.model.dto.Member;
import com.ssafy.snapfit.model.dto.SearchCondition;

@Service
public class CommentServiceImpl implements CommentService {

	private final CommentDao commentDao;
	private final MemberDao memberDao;
	private final LikeDao likeDao;

	public CommentServiceImpl(CommentDao commentDao, MemberDao memberDao, LikeDao likeDao) {
		this.commentDao = commentDao;
		this.memberDao = memberDao;
		this.likeDao = likeDao;
	}

	// 1-1. 특정 영상에 대해 좋아요 또는 최신순으로 모든 댓글 조회하기(가져오기)
	@Override
	public List<Comment> findAllComments(long videoNo, SearchCondition sc, long loginNo) {
		
		Map<String, Object> map = new HashMap<>();
		map.put("videoNo", videoNo);
		map.put("sc", sc);
		
		List<Comment> list = commentDao.selectAllComments(map);
		
		for(Comment comment : list) {
			// 1. 프로필 이미지를 넣어줌
			Member member = memberDao.selectMember(new SearchCondition("no", String.valueOf(comment.getMemberNo()), null, null));
			// 2. 좋아요 여부
			LikeComment likeComment = new LikeComment(loginNo, comment.getNo());

			comment.setProfileImg(member.getProfileImg());
			comment.setIsLike(likeDao.checkCommentLike(likeComment) != null );
		}
		return list;
		
	}

	// 1-2. 특정 영상에 대해 하나의 댓글 등록하기(삽입하기)
	@Override
	public Boolean addComment(Comment comment) {
		
		int judge = commentDao.insertComment(comment);
		
		if (judge != 0) {
			return true;
		}
		
		return false;
		
	}

	// 1-3. 특정 영상에 대해 하나의 댓글 수정하기
	@Override
	public Boolean modifyComment(Comment comment) {
		
		int judge = commentDao.updateComment(comment);
		
		if (judge != 0) {
			return true;
		}
		
		return false;
		
	}

	// 1-4. 특정 영상에 대해 하나의 댓글 PK로 삭제하기
	@Override
	public Boolean removeComment(long commentNo) {
		
		int judge = commentDao.deleteComment(commentNo);
		
		if (judge != 0) {
			return true;
		}
		
		return false;
		
	}

	// 2. 특정 유저가 작성한 모든 댓글들을 최신순으로 조회하기(가져오기)
	@Override
	public List<Comment> findAllCommentsWrittenByMember(long memberNo) {
		return commentDao.selectAllCommentsWrittenByMember(memberNo);
	}
	
}
