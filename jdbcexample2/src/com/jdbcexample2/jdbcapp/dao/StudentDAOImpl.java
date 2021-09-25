package com.jdbcexample2.jdbcapp.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.jdbcexample2.jdbcapp.dao.StudentDAO;
import com.jdbcexample2.jdbcapp.dto.StudentDetailsDTO;
public class StudentDAOImpl implements StudentDAO {

	@Override
	public List<StudentDetailsDTO> getAll() {
		List<StudentDetailsDTO> list = new ArrayList<StudentDetailsDTO>();
		Connection conn = null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root","Jobs@2212");
			Statement stat = conn.createStatement();
			ResultSet result = stat.executeQuery("select * from student_info");  
			while(result.next()) {
				StudentDetailsDTO dto = new StudentDetailsDTO();
				int id=result.getInt(1);
				String name= result.getString(2);
				String qualification= result.getString(3);
				String place= result.getString(4);
				
				dto.setStd_id(id);
				dto.setStd_name(name);
				dto.setStd_qualification(qualification);
				dto.setStudent_place(place);
		list.add(dto);

		}
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
	
     return list;
}

	@Override
	public boolean save(StudentDetailsDTO dto) {
		boolean save=false;
		Connection conn = null;
		try {
			
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root","Jobs@2212");
			Statement statement = conn.createStatement();
			  save= statement.execute("insert into student_info value(34,'chandana','BE','Hunsur')");
			 if(save==false) {
					System.out.println("data saved");
				}else
					System.out.println("data not saved");
			} catch ( SQLException e) {
				
				e.printStackTrace();
			}finally {
				try {
					conn.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
	
		
		return save; 
	}

	@Override
	public StudentDetailsDTO getByName(String name) {
		 StudentDetailsDTO dto = new StudentDetailsDTO();
		 Connection conn = null;
		 try {
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root","Jobs@2212");
			
			 Statement stat = conn.createStatement();
				ResultSet rs = stat.executeQuery("select * from student_info where std_name='"+name+"'"); 
			  
			   while(rs.next()) {
				  
				   
				   int id=rs.getInt(1);
					String name1= rs.getString(2);
					String qualification= rs.getString(3);
					String place= rs.getString(4);
					
					dto.setStd_id(id);
					dto.setStd_name(name);
					dto.setStd_qualification(qualification);
					dto.setStudent_place(place);
			   }
					   
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		   
	
	
		return dto;
	}

	@Override
	public List<StudentDetailsDTO> getByPlace(String place) {
		List<StudentDetailsDTO> list = new ArrayList<StudentDetailsDTO>();
		Connection conn = null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root","Jobs@2212");
			Statement stat = conn.createStatement();
			ResultSet result = stat.executeQuery("select student_place from student_info");  
			while(result.next()) {
				StudentDetailsDTO dto = new StudentDetailsDTO();
				
				
				String place1= result.getString(1);
				
				
				dto.setStudent_place(place1);
				list.add(dto);
		

		}
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
	
     return list;
		
	
}

	@Override
	public boolean updateplaceByName(String name, String place) {
	 boolean update = false;
	 Connection conn = null;
	 
	 try {
		 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root","Jobs@2212");
		 Statement stat = conn.createStatement();
		 update = stat.execute("update student_info set student_place='Tumkur' where std_name='monisha'");
		 if(update==false) {
			 System.out.println("Data Updated");
		 }
	 }catch(SQLException e) {
		 e.printStackTrace();
	 }
		return false;
	}
}