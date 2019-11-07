package com.training.service;

import java.util.List;

import com.training.beans.Employee;

public interface EmployeeService {
	void addEmployee(List<Employee> eList);
	int searchEmployee(List<Employee> eList,int id);
	boolean deleteEmployee(List<Employee> eList,int id);
	Employee searchEmployeeName(List<Employee> eList,String name);
}
