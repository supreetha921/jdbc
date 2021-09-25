package com.mobile.mobileapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.mobile.mobileapp.dto.MobileDTO;

public class MobileDAOImpl implements MobileDAO {
	
	@Override
	public boolean saveAll(List<MobileDTO> list) {
		Connection conn = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mobile", "root", "Jobs@2212");
			conn.setAutoCommit(false);
			PreparedStatement stat = conn.prepareStatement("insert into mobiledetails values(?,?,?,?)");
			for (MobileDTO mobile : list) {
				stat.setInt(1, mobile.getMb_id());
				stat.setString(2,mobile.getMb_name());
				stat.setString(3,mobile.getMb_brand());
				stat.setString(4,mobile.getMb_network());
				stat.execute();
			}
			conn.commit();
			return true;
			
		} catch (SQLException e) {
			try {
			conn.rollback();
		} catch (SQLException e1) {
			System.err.println(e.getClass());
			System.err.println(e.getMessage());
			
		e1.printStackTrace();
		}
			
			e.printStackTrace();
		} finally {
			try {
				conn.commit();
				conn.close();
			} catch (SQLException e) {
				System.err.println(e.getClass());
				System.err.println(e.getMessage());
					}

		}
		return false;
	


		
		
	}

}
