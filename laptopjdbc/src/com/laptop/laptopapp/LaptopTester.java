package com.laptop.laptopapp;

import java.util.ArrayList;
import java.util.List;

import com.laptop.laptopapp.dao.LaptopDAO;
import com.laptop.laptopapp.dao.LaptopDAOImpl;
import com.laptop.laptopapp.dto.LaptopDTO;

public class LaptopTester {
	public static void main(String[] args) {
		LaptopDAO dao = new LaptopDAOImpl();
		LaptopDTO dto = new LaptopDTO();
		//dao.save(dto);
		LaptopDTO dao1= dao.getByName("HP");
		System.out.println(dao1);
		
		LaptopDTO dto1 = new LaptopDTO(2,"dell",45000,"2021-09-08","4GB");
		LaptopDTO dto2 = new LaptopDTO(3,"lenovo",95000,"2021-12-08","8GB");
		LaptopDTO dto3 = new LaptopDTO(4,"Acer",78000,"2020-11-08","4GB");
		
		
		
		System.out.println("--------------------------------");
		
		List<LaptopDTO> list1 = new ArrayList<LaptopDTO>();
		list1.add(dto1);
		list1.add(dto2);
		list1.add(dto3);
		boolean saved=dao.saveAll(list1);
		if(saved) {
			System.out.println("data saved");
		}else {
			System.out.println("data not saved");
		}
	}

}
