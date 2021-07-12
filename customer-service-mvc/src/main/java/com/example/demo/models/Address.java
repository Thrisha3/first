package com.example.demo.models;

public class Address {

	private String strret;
	private String adressline;
	private long pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String strret, String adressline, long pincode) {
		super();
		this.strret = strret;
		this.adressline = adressline;
		this.pincode = pincode;
	}
	public String getStrret() {
		return strret;
	}
	public void setStrret(String strret) {
		this.strret = strret;
	}
	public String getAdressline() {
		return adressline;
	}
	public void setAdressline(String adressline) {
		this.adressline = adressline;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [strret=" + strret + ", adressline=" + adressline + ", pincode=" + pincode + "]";
	}
	
	
	
}
