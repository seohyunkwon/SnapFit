package com.ssafy.snapfit.model.dto;

import java.util.Date;

public class Member {
	private long no;
	private String id;
	private String password;
	private String nickname;
	private String profileImg;
	private Date birthDate;
	private int gender;
		
	public Member() {}

	public Member(long no, String id, String password, String nickname, String profileImg, Date birthDate,
			int gender) {
		this.no = no;
		this.id = id;
		this.password = password;
		this.nickname = nickname;
		this.profileImg = profileImg;
		this.birthDate = birthDate;
		this.gender = gender;
	}

	public Member(String id, String password, String nickname, String profileImg, Date birthDate, int gender) {
		this.id = id;
		this.password = password;
		this.nickname = nickname;
		this.profileImg = profileImg;
		this.birthDate = birthDate;
		this.gender = gender;
	}

	public long getNo() {
		return no;
	}

	public void setNo(long no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getProfileImg() {
		return profileImg;
	}

	public void setProfileSrc(String profileImg) {
		this.profileImg = profileImg;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Member [ no=" + no + ", id=" + id + ", password=" + password + ", nickname="
				+ nickname + ", profileImg=" + profileImg + ", birth=" + birthDate + ", gender=" + gender + "]";
	}
}
