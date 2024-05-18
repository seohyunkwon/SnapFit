package com.ssafy.snapfit.model.dto;

public class NotificationCode {
	private long no;
	private String message;
	
	public NotificationCode() {}

	public NotificationCode(long no, String message) {
		this.no = no;
		this.message = message;
	}

	public NotificationCode(String message) {
		super();
		this.message = message;
	}

	public long getNo() {
		return no;
	}

	public void setNo(long no) {
		this.no = no;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "NotificationCode [no=" + no + ", message=" + message + "]";
	}
	
}
