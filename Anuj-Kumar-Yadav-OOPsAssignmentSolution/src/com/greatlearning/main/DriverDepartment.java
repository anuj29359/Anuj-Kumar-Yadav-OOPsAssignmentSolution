package com.greatlearning.main;
import com.greatlearning.departments.AdminDepartment;
import com.greatlearning.departments.HrDepartment;
import com.greatlearning.departments.TechDepartment;

public class DriverDepartment {
	
	/**
	 * The Driver class to create objects of all the deptartments and use its methods
	 *   → Driver class Main will be used to create objects of HrDepartment, TechDepartment, AdminDepartment
	 *   → Each department will display all its functionalities.
	 *   → Each department  will display whether today is a holiday or not with the help of 
	 * the Super Department. (SuperDepartment will act as a super class for all the departments)
	 */

	public static void main(String[] args) {
		
		// Admin Department
		AdminDepartment ad = new AdminDepartment();
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		System.out.println();
		
		// HR Department
		HrDepartment hd = new HrDepartment();
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(hd.isTodayAHoliday());
		System.out.println();
		
		// Tech department
		TechDepartment td = new TechDepartment();
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());
		System.out.println();
		

	}

}
