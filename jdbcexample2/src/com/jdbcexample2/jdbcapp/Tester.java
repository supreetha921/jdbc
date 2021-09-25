package com.jdbcexample2.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Tester {
	public static void main (String[] args) {
		
		//Tester.save();
		//Tester .delete();
		//Tester.update();
		getAll();
		
	}
	static void getAll() {
		try {
			
			Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root","Jobs@2212");
			Statement stat = connect.createStatement();
			ResultSet result = stat.executeQuery("select * from student_info");  
			while(result.next()) {
				int id=result.getInt("std_id");
				String name= result.getString("std_name");
				String qualification= result.getString("std_qualification");
				String place= result.getString("student_place");
				System.out.println(id+"\t"+name+"\t"+qualification+"\t"+place);
		
			}
			connect.close();
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
		
		static void save(){
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root","Jobs@2212");
			Statement statement = connect.createStatement();
		
			boolean saved = statement.execute("insert into student_info values(12,'Monisha','BE','Mysore'),(11,'Geetha','BSC','Manglore'),(13,'Harshika','BA','Tumkur')");
			
			
			
			if(saved==false) {
				System.out.println("data saved");
			}else
				System.out.println("data not saved");
		} catch ( SQLException e) {
			
			e.printStackTrace();
		} 
	

}
	static void delete(){
		try {
			Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root","Jobs@2212");
			Statement statement = connect.createStatement();
		
			//boolean delete = statement.execute("delete FROM student_info where std_id=12;");

			boolean delete = statement.execute("delete FROM student_info where std_id=13;");

			//boolean delete = statement.execute("DELETE FROM student_info WHERE std_qualification='BE' AND student_place='Mysore';");
		
			
			
			if(delete==false) {
				System.out.println("data deleted successfully");
			}else
				System.out.println("data not deleted");
		} catch ( SQLException e) {
			
			e.printStackTrace();
		} 
		
	}
	static void update(){
		try {
			
			Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root","Jobs@2212");
			Statement statement = connect.createStatement();
		
	

			//boolean update = statement.execute("UPDATE student_info SET student_place='Madhur' WHERE std_id=1;");
			//boolean update = statement.execute("UPDATE student_info SET std_qualification='MSC' WHERE std_id=2;");
			boolean update = statement.execute("UPDATE student_info SET std_qualification='Btech' WHERE std_id=11;");
			
			
			


		
			
			
			if(update==false) {
				System.out.println("data updated successfully");
			}else
				System.out.println("data not updated");
			
		}
		
		catch ( SQLException e) {
			
			e.printStackTrace();
		} 
		
	}
	}

