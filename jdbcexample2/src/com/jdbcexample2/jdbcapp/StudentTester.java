package com.jdbcexample2.jdbcapp;

import java.util.List;


import com.jdbcexample2.jdbcapp.dao.StudentDAO;
import com.jdbcexample2.jdbcapp.dao.StudentDAOImpl;
import com.jdbcexample2.jdbcapp.dto.StudentDetailsDTO;

public class StudentTester {
public static void main(String[] args) {
	StudentDAO dao= new StudentDAOImpl();
	StudentDetailsDTO dto = new StudentDetailsDTO();
	dao.updateplaceByName("Monisha", "Tumkur");
	//dao.save(dto);
	List<StudentDetailsDTO> list = dao.getAll();
	/*for (StudentDetailsDTO DTO : list) {
		System.out.println(DTO);
		
	}*/
	    
		StudentDetailsDTO dto1=dao.getByName("supreetha");
		System.out.println(dto1);
		dao.getByPlace("Mysore");
		for (StudentDetailsDTO dto2 : list) {
			System.out.println(dto2);
			
		}
		
	}
	
	
	
}


