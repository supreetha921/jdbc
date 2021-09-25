package com.mobile.mobileapp.dao;

import java.util.List;

import com.mobile.mobileapp.dto.MobileDTO;

public interface MobileDAO {
	
	boolean saveAll(List<MobileDTO> list);

}
