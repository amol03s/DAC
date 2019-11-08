package com.training.test;

import java.util.TreeSet;

import com.training.beans.Employee;
import com.training.mycomparator.NameCompare;

public class TestEmployee {

	public static void main(String[] args) {
		TreeSet<Employee> ts=new  TreeSet<>();
		ts.add(new Employee(10,"aaa",222));
		ts.add(new Employee(20,"bbb",333));
		ts.add(new Employee(10,"bbb",333));
		ts.add(new Employee(5,"bbb",333));
		ts.add(new Employee(15,"bbb",333));
		ts.add(new Employee(30,"bbb",333));
		ts.add(new Employee(22,"bbb",333));
		ts.add(new Employee(8,"bbb",333));
        System.out.println(ts);
        
        TreeSet<Employee> ts1=new  TreeSet<>(new NameCompare()); /*2nd TreeSet*/
        ts1.add(new Employee(10,"xxx",222));
        ts1.add(new Employee(10,"aaa",222));
        System.out.println(ts1);
        
        
        
        
        
        
	}

}
