package com.ssafy.snapfit.model.dto;

import java.util.Date;

public class Member {
<<<<<<< HEAD
	private Grade grade; 
=======
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
	private long no;
	private String id;
	private String password;
	private String nickname;
	private String profileImg;
	private Date birthDate;
	private int gender;
		
	public Member() {}

<<<<<<< HEAD
	public Member(Grade grade, long no, String id, String password, String nickname, String profileImg, Date birthDate,
			int gender) {
		this.grade = grade;
=======
	public Member(long no, String id, String password, String nickname, String profileImg, Date birthDate,
			int gender) {
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
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

<<<<<<< HEAD
	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

=======
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
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
<<<<<<< HEAD
		return "Member [grade=" + grade + ", no=" + no + ", id=" + id + ", password=" + password + ", nickname="
=======
		return "Member [ no=" + no + ", id=" + id + ", password=" + password + ", nickname="
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
				+ nickname + ", profileImg=" + profileImg + ", birth=" + birthDate + ", gender=" + gender + "]";
	}
}
