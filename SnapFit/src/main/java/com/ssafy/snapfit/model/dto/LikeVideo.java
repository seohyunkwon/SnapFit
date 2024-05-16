package com.ssafy.snapfit.model.dto;

public class LikeVideo {
	
	private long no;
	private long memberNo;
	private long videoNo;
	private Video video;
	
	public LikeVideo() {}

	public LikeVideo(long memberNo, long videoNo) {
		this.memberNo = memberNo;
		this.videoNo = videoNo;
	}

	public LikeVideo(long no, long memberNo, long videoNo) {
		super();
		this.no = no;
		this.memberNo = memberNo;
		this.videoNo = videoNo;
	}

	public LikeVideo(long no, long memberNo, long videoNo, Video video) {	
		this.no = no;
		this.memberNo = memberNo;
		this.videoNo = videoNo;
		this.video = video;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
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

	public long getVideoNo() {
		return videoNo;
	}

	public void setVideoNo(long videoNo) {
		this.videoNo = videoNo;
	}

	
	
	@Override
	public String toString() {
		return "LikeVideo [no=" + no + ", memberNo=" + memberNo + ", videoNo=" + videoNo + "]";
	}
	
}