package com.example.demo.demo;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

	private String stretName;
	private String houseName;
	
	public Address() {}
	
	
	public Address(String stretName, String houseName) {
		super();
		this.stretName = stretName;
		this.houseName = houseName;
	}
	public String getStretName() {
		return stretName;
	}
	public void setStretName(String stretName) {
		this.stretName = stretName;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	
	
}
