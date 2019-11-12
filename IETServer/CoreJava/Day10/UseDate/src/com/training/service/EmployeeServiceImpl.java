package com.training.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.training.beans.Employee;

public class EmployeeServiceImpl{// implements EmployeeService {
	static SimpleDateFormat sdf;
	static {
		sdf=new SimpleDateFormat("dd/MM/yyyy");
	}
	public Employee addEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Id");
		int id=sc.nextInt();
		System.out.println("enter Name");
		String nm=sc.next();
		System.out.println("enter Date dd/mm/yyyy");
		String d=sc.next();
		try {
			Date dt=sdf.parse(d);
			Employee e=new Employee(id,nm,dt);
			return e;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
