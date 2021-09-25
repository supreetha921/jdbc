package com.jdbcexample2.jdbcapp.dao;
import java.util.List;
import com.jdbcexample2.jdbcapp.dto.StudentDetailsDTO;
public interface StudentDAO {
	
	List<StudentDetailsDTO> getAll();
    boolean save(StudentDetailsDTO dto);
    StudentDetailsDTO getByName(String name);
    List<StudentDetailsDTO> getByPlace(String place);
    boolean updateplaceByName(String name,String place);
}
