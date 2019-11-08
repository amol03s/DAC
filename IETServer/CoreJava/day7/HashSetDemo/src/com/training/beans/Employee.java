package com.training.beans;

public class Employee {
	private int id;
	private String name;
	private double sal;
	
	public Employee(int id) {
		this.id=id;
		this.name=null;
		this.sal=0.0;
	}
	public Employee(int id,String name,double sal) {
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public String toString()
	{
		return "Id : "+id +"\nName : "+name+"\nSalary : "+sal+"\n";
	}
	public int hashCode() {
		System.out.println("In employee hashcode() "+this.id);
		return id;
	}
	public boolean equals(Object ob)
	{
		System.out.println("in employee equals() "+this.id+","+((Employee)ob).id);
		if(this.id == ((Employee)ob).id)
		{
			return true;
		}
		return false;
	}
	public String getName()
	{
		return name;
	}
	public void setSal(double sal)
	{
		this.sal=sal;
	}
}





