package com.ssafy.snapfit.model.dto;

import java.util.Date;

public class Comment {
	
	private long no;
	private long videoNo;
	private long memberNo;
	private long likeCount;
	private String memberName;
	private String content;
	private Date createdDate;
	
<<<<<<< HEAD
	public long getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(long likeCount) {
		this.likeCount = likeCount;
	}

	// 로그인한 사용자가 해당 댓글 좋아요 눌럿는지....
	private boolean isLike;
	// 댓글 작성자의 프로필 이미지
	private String profileImg;
	
=======
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
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
	
	public Comment(long no, long videoNo, long memberNo, long likeCount, String memberName, String content,
			Date createdDate) {
		this.no = no;
		this.videoNo = videoNo;
		this.memberNo = memberNo;
		this.likeCount = likeCount;
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

<<<<<<< HEAD
	
	public void setLike(boolean isLike) {
		this.isLike = isLike;
=======
	public long getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(long likeCount) {
		this.likeCount = likeCount;
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
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

<<<<<<< HEAD
	public boolean getIsLike() {
		return isLike;
	}

	public void setIsLike(boolean isLike) {
		this.isLike = isLike;
	}

	public String getProfileImg() {
		return profileImg;
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}

	@Override
	public String toString() {
		return "Comment [no=" + no + ", videoNo=" + videoNo + ", memberNo=" + memberNo + ", likeCount=" + likeCount
				+ ", memberName=" + memberName + ", content=" + content + ", createdDate=" + createdDate + ", isLike="
				+ isLike + ", profileImg=" + profileImg + "]";
=======
	@Override
	public String toString() {
		return "Comment [no=" + no + ", videoNo=" + videoNo + ", memberNo=" + memberNo + ", likeCount=" + likeCount
				+ ", memberName=" + memberName + ", content=" + content + ", createdDate=" + createdDate + "]";
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
	}

}
