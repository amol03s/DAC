package com.training.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.training.beans.Employee;

public class TestReflection {
	public static void main(String[] args) {
		Employee ob=new Employee(12,"aaa",3456);
		Class cls=ob.getClass();
		Method[] mlist=cls.getMethods();
		System.out.println("Methods in class Employee");
		for(Method x:mlist) {
			System.out.println(x.getName());
			try {
				if(x.getName().equals("hashCode"))
				    System.out.println(x.invoke(ob, null));
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
