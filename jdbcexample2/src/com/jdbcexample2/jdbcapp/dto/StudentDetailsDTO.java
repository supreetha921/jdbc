package com.jdbcexample2.jdbcapp.dto;

public class StudentDetailsDTO {
	private int std_id;
	private String std_name;
	private String std_qualification;
	private String student_place;
	
	
	public StudentDetailsDTO() {
		
	}
	public int getStd_id() {
		return std_id;
	}
	
	  public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public String getStd_qualification() {
		return std_qualification;
	}
	public void setStd_qualification(String std_qualification) {
		this.std_qualification = std_qualification;
	}
	public String getStudent_place() {
		return student_place;
	}
	public void setStudent_place(String student_place) {
		this.student_place = student_place;
	}







	@Override
	public String toString() {
		return "StudentDetailsDTO [std_id=" + std_id + ", std_name=" + std_name + ", std_qualification="
				+ std_qualification + ", student_place=" + student_place + "]";
	}
	public void add(StudentDetailsDTO sd) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
