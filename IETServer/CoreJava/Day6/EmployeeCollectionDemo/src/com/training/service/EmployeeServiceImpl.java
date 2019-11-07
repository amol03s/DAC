package com.training.service;

import java.util.List;
import java.util.Scanner;

import com.training.beans.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	public void addEmployee(List<Employee> eList)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the id : ");
		int id=sc.nextInt();
		System.out.println("Enter the name : ");
		String name=sc.next();
		System.out.println("Enter the salary : ");
		double sal=sc.nextDouble();
		
		Employee e= new Employee(id,name,sal);
		eList.add(e);
	}
	public int searchEmployee(List<Employee> eList,int id)
	{
		Employee e=new Employee(id);
		int pos=eList.indexOf(e);
		return pos;
	}
	public boolean deleteEmployee(List<Employee> eList,int id)
	{
		Employee e=new Employee(id);
		return eList.remove(e);
	}
	public Employee searchEmployeeName(List<Employee> eList,String name)
	{
		for(Employee e : eList)
		{
			if(e.getName().equals(name))
			{
				return e;
			}
		}
		return null;
	}
}
