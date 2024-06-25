package com.ssafy.snapfit.model.dto;

public class Follow {
	private long no;
	private long followingNo;
<<<<<<< HEAD
	private String followingName;
=======
	private String follwingName;
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
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
<<<<<<< HEAD
		this.followingName = follwingName;
=======
		this.follwingName = follwingName;
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
		this.followerNo = followerNo;
		this.followerName = followerName;
	}

	public String getFollwingName() {
<<<<<<< HEAD
		return followingName;
	}

	public void setFollwingName(String follwingName) {
		this.followingName = follwingName;
=======
		return follwingName;
	}

	public void setFollwingName(String follwingName) {
		this.follwingName = follwingName;
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
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
<<<<<<< HEAD
		return "Follow [no=" + no + ", followingNo=" + followingNo + ", follwingName=" + followingName + ", followerNo="
=======
		return "Follow [no=" + no + ", followingNo=" + followingNo + ", follwingName=" + follwingName + ", followerNo="
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
				+ followerNo + ", followerName=" + followerName + "]";
	}	
}
