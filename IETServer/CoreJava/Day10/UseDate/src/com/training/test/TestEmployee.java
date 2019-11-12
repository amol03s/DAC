package com.training.test;

import com.training.beans.Employee;
import com.training.service.EmployeeServiceImpl;

public class TestEmployee {

	public static void main(String[] args) {
		EmployeeServiceImpl es=new EmployeeServiceImpl();
		Employee e=es.addEmployee();
		if(e!=null) {
		System.out.println(e);
		}
		else {
			System.out.println("Error occured");
		}
	}

}
