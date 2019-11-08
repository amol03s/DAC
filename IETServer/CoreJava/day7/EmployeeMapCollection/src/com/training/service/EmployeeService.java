package com.training.service;

import java.util.List;
import java.util.Map;

import com.training.beans.Employee;

public interface EmployeeService {
	void addEmployee(Map<Integer,Employee> hm);
	public Employee searchEmployee(Map<Integer, Employee> hm, int id);
	boolean deleteEmployee(Map<Integer,Employee> hm,int id);
	Employee searchEmployeeName(Map<Integer,Employee> hm,String name);
}
