package com.training.Test;
import java.util.TreeSet;
import com.training.beans.Employee;

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
	}

}
