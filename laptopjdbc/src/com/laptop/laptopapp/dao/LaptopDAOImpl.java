package com.laptop.laptopapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.laptop.laptopapp.dto.LaptopDTO;

public class LaptopDAOImpl implements LaptopDAO {

	@Override
	public LaptopDTO getByName(String name) {
		Connection conn=null;
		LaptopDTO dto = new LaptopDTO();
		try {
		 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Laptops", "root","Jobs@2212");
			PreparedStatement stat = conn.prepareStatement("select * from laptopdetails where NAME= ? ");
			stat.setString(1,name);
			ResultSet rs=stat.executeQuery();
			while(rs.next()) {
				int ID=rs.getInt(1);
				
				String NAME = rs.getString(2);
				double PRICE = rs.getDouble(3);
				String MANUFACTURE_DATE = rs.getString(4);
				String STORAGE = rs.getString(5);
				
				dto.setName(NAME);
				dto.setPrice(PRICE);
				dto.setManufacture_date(MANUFACTURE_DATE);
				dto.setStorage(STORAGE);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				
				conn.close();
			}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
		
		return dto;
	}
}

	@Override
	public boolean saveAll(List<LaptopDTO> list) {
		Connection conn=null;
		
		try {
		 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Laptops", "root","Jobs@2212");
		 conn.setAutoCommit(false);
			PreparedStatement stat = conn.prepareStatement("insert into laptopdeatils values(? ? ? ? ?) ");
			
			for (LaptopDTO laptop : list) {
				stat.setInt(1, laptop.getId());
				stat.setString(2,laptop.getName() );
				stat.setString(3,laptop.getManufacture_date());
				stat.setString(4,laptop.getStorage());
				stat.setDouble(5,laptop.getPrice());
				
			}
				conn.commit();
				return true;
				}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					conn.commit();
					conn.close();
				}catch(SQLException e) {
					System.err.println(e.getClass());
					System.err.println(e.getMessage());
				}
			}
		return false;
		
		
	}
	}
