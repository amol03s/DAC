package com.training.bean;

public class Employee  extends Person{
	private String dept,desg;
	public Employee(String nm,String dt,String ds) {
		super(nm);
		System.out.println("In parametrised employee constructor");
		dept=dt;
		desg=ds;
	}
	public String toString() {
		return super.toString()+"\nDepartment : "+dept+"\nDesignation : "+desg;
		
	}

}
