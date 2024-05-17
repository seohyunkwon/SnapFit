package com.ssafy.snapfit.model.dto;

import java.util.Date;

public class Video {
	
	private long no;
	private long uploaderNo;
	private String uploaderName;
	private long exerciseNo;
	private String exerciseName;
	private String title;
	private String content;
	private Date createdDate;
	
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

	public long getExerciseNo() {
		return exerciseNo;
	}

	public void setExerciseNo(long exerciseNo) {
		this.exerciseNo = exerciseNo;
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

	public String getUploaderName() {
		return uploaderName;
	}

	public void setUploaderName(String uploaderName) {
		this.uploaderName = uploaderName;
	}

	public String getExerciseName() {
		return exerciseName;
	}

	public void setExerciseName(String exerciseName) {
		this.exerciseName = exerciseName;
	}

	@Override
	public String toString() {
		return "Video [no=" + no + ", uploaderNo=" + uploaderNo + ", uploaderName=" + uploaderName + ", exerciseNo="
				+ exerciseNo + ", exerciseName=" + exerciseName + ", title=" + title + ", content=" + content
				+ ", createdDate=" + createdDate + "]";
	}
	
}
