package com.training.beans;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double sal;
	
	public Employee(int id,String nm,double s) {
		this.id=id;
		this.name=nm;
		this.sal=s;
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Id : "+id+"\nName : "+name+"\nSalary : "+sal;	}
	
	@Override
	public int compareTo(Employee ob) {
		System.out.println("In Employee CompatreTo() "+this.id+","+ob.id);
		if (this.id<ob.id)
			return -1;
	else if(this.id==ob.id) 
		return 0;
	else
		return 1;
		
	}
	
	

}
