package com.jordi.jormall.dto;

public class Product {
	
	private String code;
	private String name;
	private long price;
	private int numOfLeft;
	private enum Delivery {
		ALL,LOCAL, INTERNATIONAL
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
