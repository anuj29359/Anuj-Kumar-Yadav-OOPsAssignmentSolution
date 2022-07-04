package com.greatlearning.departments;
/**
 * Admin department will contain 3 methods of return type String and will not accept any parameter
 *             i)  departmentName 
 *             ii)  getTodaysWork  
 *             iii) getWorkDeadline
 */

/**
 * @author Anuj
 *
 */
public class AdminDepartment extends SuperDepartment{


	public AdminDepartment() {
		System.out.println("Welcome to Admin Department");
	}
	
	public String departmentName(){
		return "Admin Department";
	}



	public String getTodaysWork() {
		return "complete your documents submission";
	}
	
	
	public String getWorkDeadline(){
		return "Complete by EOD";
	}


}


