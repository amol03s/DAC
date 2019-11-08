package com.training.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import com.training.beans.Employee;

public class TestSet {

	public static void main(String[] args) {
	Set<Employee> s=new LinkedHashSet<>();
	s.add(new Employee(10,"aaa",222));
	s.add(new Employee(20,"aaa",222));
	s.add(new Employee(10,"xx",444));
	s.add(new Employee(10,"aaa",222));
	System.out.println(s);
	System.out.println(s.contains(new Employee(10)));

	}

}
