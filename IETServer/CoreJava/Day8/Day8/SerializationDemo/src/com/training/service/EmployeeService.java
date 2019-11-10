package com.training.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.training.beans.Employee;

public interface EmployeeService {

	public void readFile(File f,List<Employee> elist);
	public boolean addEmployee(List<Employee> elist);
	public void writeFile(File f,List<Employee> elist);
}
