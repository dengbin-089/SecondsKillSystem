package com.ahu.SecondsKillSystem.entity;


public class Msmerchant {
	
	private int id;
	private String merchantname;
	private String merchantaccount;
	private String merchantpassword;
	private String merchantscope;
	private String merchantshopname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMerchantname() {
		return merchantname;
	}
	public void setMerchantname(String merchantname) {
		this.merchantname = merchantname;
	}
	public String getMerchantaccount() {
		return merchantaccount;
	}
	public void setMerchantaccount(String merchantaccount) {
		this.merchantaccount = merchantaccount;
	}
	public String getMerchantpassword() {
		return merchantpassword;
	}
	public void setMerchantpassword(String merchantpassword) {
		this.merchantpassword = merchantpassword;
	}
	public String getMerchantscope() {
		return merchantscope;
	}
	public void setMerchantscope(String merchantscope) {
		this.merchantscope = merchantscope;
	}
	public String getMerchantshopname() {
		return merchantshopname;
	}
	public void setMerchantshopname(String merchantshopname) {
		this.merchantshopname = merchantshopname;
	}
	
	@Override
	public String toString() {
		return "Msmerchant [id=" + id + ", merchantname=" + merchantname + ", merchantaccount=" + merchantaccount
				+ ", merchantpassword=" + merchantpassword + ", merchantscope=" + merchantscope + ", merchantshopname="
				+ merchantshopname + "]";
	}
	
	
}
