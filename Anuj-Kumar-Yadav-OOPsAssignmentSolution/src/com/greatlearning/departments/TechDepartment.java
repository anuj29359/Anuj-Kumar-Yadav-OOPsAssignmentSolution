package com.greatlearning.departments;

public class TechDepartment extends SuperDepartment{

	
	
	public TechDepartment() {
		System.out.println("Welcome to Tech Department!");
		
	}
	
	public String departmentName(){
	
	return "Tech Department";
	
	}
	
	
	
	public String getTodaysWork(){
	
	return "Complete coding of module 1";
	
	}
	
	
	public String getWorkDeadline(){
	
	return "Complete by EOD";
	
	}
	
	
	
	public String getTechStackInformation(){
	
	return "Core java";
	
	
	}

}