package com.ssafy.snapfit.model.dto;

public class LikeComment {
	
	private long no;
	private long memberNo;
	private long commentNo;
	
	public LikeComment() {}

	public LikeComment(long memberNo, long commentNo) {
		this.memberNo = memberNo;
		this.commentNo = commentNo;
	}

	public LikeComment(long no, long memberNo, long commentNo) {
		super();
		this.no = no;
		this.memberNo = memberNo;
		this.commentNo = commentNo;
	}

	public long getNo() {
		return no;
	}

	public void setNo(long no) {
		this.no = no;
	}

	public long getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(long memberNo) {
		this.memberNo = memberNo;
	}

	public long getCommentNo() {
		return commentNo;
	}

	public void setCommentNo(long commentNo) {
		this.commentNo = commentNo;
	}

	@Override
	public String toString() {
		return "LikeComment [no=" + no + ", memberNo=" + memberNo + ", commentNo=" + commentNo + "]";
	}
	
}
