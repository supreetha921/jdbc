package com.mobile.mobileapp.dto;

public class MobileDTO {

	private int mb_id;
	private String mb_name;
	private String mb_brand;
	private String mb_network;

	public MobileDTO() {
		
	}

	
	
	public MobileDTO(int mb_id, String mb_name, String mb_brand, String mb_network) {
		super();
		this.mb_id = mb_id;
		this.mb_name = mb_name;
		this.mb_brand = mb_brand;
		this.mb_network = mb_network;
	}



	
	
	
	
	public int getMb_id() {
		return mb_id;
	}



	public void setMb_id(int mb_id) {
		this.mb_id = mb_id;
	}



	public String getMb_name() {
		return mb_name;
	}



	public void setMb_name(String mb_name) {
		this.mb_name = mb_name;
	}



	public String getMb_brand() {
		return mb_brand;
	}



	public void setMb_brand(String mb_brand) {
		this.mb_brand = mb_brand;
	}



	public String getMb_network() {
		return mb_network;
	}



	public void setMb_network(String mb_network) {
		this.mb_network = mb_network;
	}



	@Override
	public String toString() {
		return "MobileDTO [mb_id=" + mb_id + ", mb_name=" + mb_name + ", mb_brand=" + mb_brand + ", mb_network="
				+ mb_network + "]";
	}



	
	
	
}
