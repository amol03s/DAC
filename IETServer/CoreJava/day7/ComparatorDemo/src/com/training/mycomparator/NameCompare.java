package com.training.mycomparator;

import java.util.Comparator;

import com.training.beans.Employee;

public class NameCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());   /*This will give Strings class comapare method*/
		
	}
	

}
