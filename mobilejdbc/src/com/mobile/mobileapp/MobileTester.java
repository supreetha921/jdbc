package com.mobile.mobileapp;

import java.util.ArrayList;
import java.util.List;

import com.mobile.mobileapp.dao.MobileDAO;
import com.mobile.mobileapp.dao.MobileDAOImpl;
import com.mobile.mobileapp.dto.MobileDTO;



public class MobileTester {
	public static void main(String[] args) {
	MobileDAO dao = new MobileDAOImpl();
	List<MobileDTO> list = new ArrayList<MobileDTO>();
	//MobileDTO dto1 = new MobileDTO(1,"vivov5","vivo","5G");
	//MobileDTO dto2 = new MobileDTO(2,"sansungs21","samsung","5G");
	//MobileDTO dto3 = new MobileDTO(3,"iphone12","apple","5G");
	MobileDTO dto4 = new MobileDTO(6,"oppofl5","oppo","5G");
	MobileDTO dto5 = null;
	MobileDTO dto6 = new MobileDTO(5,"oppofll","oppo","5G");
	
	
	
	
	
	
	
	List<MobileDTO> list1 = new ArrayList<MobileDTO>();
	//list1.add(dto1);
	//list1.add(dto2);
	//list1.add(dto3);
	list1.add(dto4);
	list1.add(dto5);
	list1.add(dto6);
	
	boolean saved=dao.saveAll(list1);
	if(saved) {
		System.out.println("data saved");
	}else {
		System.out.println("data not saved");
	}
}
}


