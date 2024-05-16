package com.ssafy.snapfit.model.dto;

public class Exercise {
	
	private long no;
	private String name;
	private String part;
	
	public Exercise() {}

	public Exercise(long no, String name, String part) {
		this.no = no;
		this.name = name;
		this.part = part;
	}

	public Exercise(String name, String part) {
		this.name = name;
		this.part = part;
	}

	public long getNo() {
		return no;
	}

	public void setNo(long no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	@Override
	public String toString() {
		return "Exercise [no=" + no + ", name=" + name + ", part=" + part + "]";
	}
	
}
