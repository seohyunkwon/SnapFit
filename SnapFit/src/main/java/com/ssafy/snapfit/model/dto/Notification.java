package com.ssafy.snapfit.model.dto;

import java.util.Date;

public class Notification {
	private long no;
	private long receiverNo;
	private String receiverName;
	private long senderNo;
	private String senderName;
	private long notificationCodeNo;
	private Boolean isRead;
	private Date createdDate;
	
	public Notification() {}

	public Notification(long no, long receiverNo, long senderNo, long notificationCodeNo, Boolean isRead,
			Date createdDate) {
		this.no = no;
		this.receiverNo = receiverNo;
		this.senderNo = senderNo;
		this.notificationCodeNo = notificationCodeNo;
		this.isRead = isRead;
		this.createdDate = createdDate;
	}

	public Notification(long receiverNo, long senderNo, long notificationCodeNo) {
		super();
		this.receiverNo = receiverNo;
		this.senderNo = senderNo;
		this.notificationCodeNo = notificationCodeNo;
	}

	public long getNo() {
		return no;
	}

	public void setNo(long no) {
		this.no = no;
	}

	public long getReceiverNo() {
		return receiverNo;
	}

	public void setReceiverNo(long receiverNo) {
		this.receiverNo = receiverNo;
	}

	public long getSenderNo() {
		return senderNo;
	}

	public void setSenderNo(long senderNo) {
		this.senderNo = senderNo;
	}

	public long getNotificationCodeNo() {
		return notificationCodeNo;
	}

	public void setNotificationCodeNo(long notificationCodeNo) {
		this.notificationCodeNo = notificationCodeNo;
	}

	public Boolean getIsRead() {
		return isRead;
	}

	public void setIsRead(Boolean isRead) {
		this.isRead = isRead;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Notification [no=" + no + ", receiverNo=" + receiverNo + ", senderNo=" + senderNo
				+ ", notificationCodeNo=" + notificationCodeNo + ", isRead=" + isRead + ", createdDate=" + createdDate
				+ "]";
	}
	
}
