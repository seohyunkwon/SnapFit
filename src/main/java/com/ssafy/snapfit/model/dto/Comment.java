package com.ssafy.snapfit.model.dto;

import java.util.Date;

public class Comment {
	
	private long no;
	private long videoNo;
	private long memberNo;
	private String memberName;
	private String content;
	private Date createdDate;
	
	public Comment() {}

	public Comment(long no, long videoNo, long memberNo, String content, Date createdDate) {
		this.no = no;
		this.videoNo = videoNo;
		this.memberNo = memberNo;
		this.content = content;
		this.createdDate = createdDate;
	}

	public Comment(long videoNo, long memberNo, String content) {
		this.videoNo = videoNo;
		this.memberNo = memberNo;
		this.content = content;
	}
	
	public Comment(long no, long videoNo, long memberNo, String memberName, String content, Date createdDate) {
		this.no = no;
		this.videoNo = videoNo;
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.content = content;
		this.createdDate = createdDate;
	}

	public long getNo() {
		return no;
	}

	public void setNo(long no) {
		this.no = no;
	}

	public long getVideoNo() {
		return videoNo;
	}

	public void setVideoNo(long videoNo) {
		this.videoNo = videoNo;
	}

	public long getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(long memberNo) {
		this.memberNo = memberNo;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Comment [no=" + no + ", videoNo=" + videoNo + ", memberNo=" + memberNo + ", memberName=" + memberName
				+ ", content=" + content + ", createdDate=" + createdDate + "]";
	}

}
