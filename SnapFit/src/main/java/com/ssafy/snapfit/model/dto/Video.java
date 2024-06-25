package com.ssafy.snapfit.model.dto;

import java.util.Date;

public class Video {
	
	private long no;
	private long uploaderNo;
	private String uploaderName;
	private long exerciseNo;
	private String exerciseName;
	private long likeCount;
	private long commentCount;
	private String title;
	private String content;
	private Date createdDate;
<<<<<<< HEAD
	private String profileImg;
	
	public String getProfileImg() {
		return profileImg;
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}

=======
	
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
	public Video() {}

	public Video(long no, long uploaderNo, String uploaderName, long exerciseNo, String exerciseName, String title,
			String content, Date createdDate) {
		super();
		this.no = no;
		this.uploaderNo = uploaderNo;
		this.uploaderName = uploaderName;
		this.exerciseNo = exerciseNo;
		this.exerciseName = exerciseName;
		this.title = title;
		this.content = content;
		this.createdDate = createdDate;
	}

	public Video(long no, long uploaderNo, long exerciseNo, String title, String content, Date createdDate) {
		this.no = no;
		this.uploaderNo = uploaderNo;
		this.exerciseNo = exerciseNo;
		this.title = title;
		this.content = content;
		this.createdDate = createdDate;
	}

	public Video(long uploaderNo, long exerciseNo, String title, String content) {
		this.uploaderNo = uploaderNo;
		this.exerciseNo = exerciseNo;
		this.title = title;
		this.content = content;
	}

	public Video(long no, long uploaderNo, String uploaderName, long exerciseNo, String exerciseName, long likeCount,
			long commentCount, String title, String content, Date createdDate) {
		this.no = no;
		this.uploaderNo = uploaderNo;
		this.uploaderName = uploaderName;
		this.exerciseNo = exerciseNo;
		this.exerciseName = exerciseName;
		this.likeCount = likeCount;
		this.commentCount = commentCount;
		this.title = title;
		this.content = content;
		this.createdDate = createdDate;
	}

	public long getNo() {
		return no;
	}

	public void setNo(long no) {
		this.no = no;
	}

	public long getUploaderNo() {
		return uploaderNo;
	}

	public void setUploaderNo(long uploaderNo) {
		this.uploaderNo = uploaderNo;
	}

	public String getUploaderName() {
		return uploaderName;
	}

	public void setUploaderName(String uploaderName) {
		this.uploaderName = uploaderName;
	}

	public long getExerciseNo() {
		return exerciseNo;
	}

	public void setExerciseNo(long exerciseNo) {
		this.exerciseNo = exerciseNo;
	}

	public String getExerciseName() {
		return exerciseName;
	}

	public void setExerciseName(String exerciseName) {
		this.exerciseName = exerciseName;
	}

	public long getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(long likeCount) {
		this.likeCount = likeCount;
	}

	public long getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(long commentCount) {
		this.commentCount = commentCount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	@Override
	public String toString() {
		return "Video [no=" + no + ", uploaderNo=" + uploaderNo + ", uploaderName=" + uploaderName + ", exerciseNo="
				+ exerciseNo + ", exerciseName=" + exerciseName + ", likeCount=" + likeCount + ", commentCount="
				+ commentCount + ", title=" + title + ", content=" + content + ", createdDate=" + createdDate + "]";
	}
	
}
