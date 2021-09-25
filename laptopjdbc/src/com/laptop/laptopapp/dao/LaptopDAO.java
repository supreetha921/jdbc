package com.laptop.laptopapp.dao;

import java.util.List;

import com.laptop.laptopapp.dto.LaptopDTO;

public interface LaptopDAO {
 //boolean save(LaptopDTO dto);
 LaptopDTO getByName(String name);
 boolean saveAll(List<LaptopDTO> list);
}
