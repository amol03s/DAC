package com.training.service;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.training.beans.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void addEmployee(Map<Integer, Employee> hm) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter id");
		int id =sc.nextInt();
		System.out.println("enter name");
		String name =sc.next();
		System.out.println("enter sal");
		double sal =sc.nextDouble();
		Employee emp=  new Employee(id, name, sal);
		hm.put(id, emp);
	}

	@Override
	public Employee searchEmployee(Map<Integer, Employee> hm, int id) {
		// TODO Auto-generated method stub
		if(hm.containsKey(id))
		{
			return hm.get(id); 
		}
		return null;
	}

	@Override
	public boolean deleteEmployee(Map<Integer, Employee> hm, int id) {
		if(hm.containsKey(id))
		{
			hm.remove(id);
			return true;
		}
		return false;
	}

	@Override
	public Employee searchEmployeeName(Map<Integer, Employee> hm, String name) {
		 Set<Integer> s = hm.keySet();
		 System.out.println("Printing KeySet"+hm.keySet());
		 for(Integer i: s)
		 {
			 Employee e= hm.get(i);
			 if(e.getName().equals(name))
			 {
				 return e;
			 }
		 }
		return null;
	}
	

}
