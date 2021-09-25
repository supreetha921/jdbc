package com.laptop.laptopapp.dto;

public class LaptopDTO {
	int id;
	String name;
	double price;
	String manufacture_date;
	String storage;
	
	public LaptopDTO() {
		
	}
	
	
	
	public LaptopDTO(int id, String name, double price, String manufacture_date, String storage) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.manufacture_date = manufacture_date;
		this.storage = storage;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}



	public String getManufacture_date() {
		return manufacture_date;
	}


	public void setManufacture_date(String manufacture_date) {
		this.manufacture_date = manufacture_date;
	}


	public String getStorage() {
		return storage;
	}


	public void setStorage(String storage) {
		this.storage = storage;
	}

	
	
	
	@Override
	public String toString() {
		return "LaptopDTO [id=" + id + ", name=" + name + ", price=" + price + ", manufacture_date=" + manufacture_date
				+ ", storage=" + storage + "]";
	}








	
}
