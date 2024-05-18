package com.ssafy.snapfit.model.dto;

public class Follow {
	private long no;
	private long followingNo;
	private String follwingName;
	private long followerNo;
	private String followerName;
	
	public Follow() {}

	public Follow(long no, long followingNo, long followerNo) {
		super();
		this.no = no;
		this.followingNo = followingNo;
		this.followerNo = followerNo;
	}

	public Follow(long no, long followingNo, String follwingName, long followerNo, String followerName) {
		super();
		this.no = no;
		this.followingNo = followingNo;
		this.follwingName = follwingName;
		this.followerNo = followerNo;
		this.followerName = followerName;
	}

	public String getFollwingName() {
		return follwingName;
	}

	public void setFollwingName(String follwingName) {
		this.follwingName = follwingName;
	}

	public String getFollowerName() {
		return followerName;
	}

	public void setFollowerName(String followerName) {
		this.followerName = followerName;
	}

	public Follow(long followingNo, long followerNo) {
		super();
		this.followingNo = followingNo;
		this.followerNo = followerNo;
	}

	public long getNo() {
		return no;
	}

	public void setNo(long no) {
		this.no = no;
	}

	public long getFollowingNo() {
		return followingNo;
	}

	public void setFollowingNo(long followingNo) {
		this.followingNo = followingNo;
	}

	public long getFollowerNo() {
		return followerNo;
	}

	public void setFollowerNo(long followerNo) {
		this.followerNo = followerNo;
	}

	@Override
	public String toString() {
		return "Follow [no=" + no + ", followingNo=" + followingNo + ", follwingName=" + follwingName + ", followerNo="
				+ followerNo + ", followerName=" + followerName + "]";
	}	
}
