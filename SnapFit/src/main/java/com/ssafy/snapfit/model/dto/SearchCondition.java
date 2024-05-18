package com.ssafy.snapfit.model.dto;

public class SearchCondition {
	
	private String key; // 어떤 것을 검색할 것인지 결정
	private String value; // 검색어가 무엇인지 결정
	private String orderBy; // 정렬 기준
	private String orderByDir; // ASC or DESC
	
	public SearchCondition() {}
	
	public SearchCondition(String key, String value, String orderBy, String orderByDir) {
		this.key = key;
		this.value = value;
		this.orderBy = orderBy;
		this.orderByDir = orderByDir;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getOrderByDir() {
		return orderByDir;
	}

	public void setOrderByDir(String orderByDir) {
		this.orderByDir = orderByDir;
	}

	@Override
	public String toString() {
		return "SearchCondition [key=" + key + ", value=" + value + ", orderBy=" + orderBy + ", orderByDir="
				+ orderByDir + "]";
	}
	
}