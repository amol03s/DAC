package com.training.bean;

public class SalariedEmp extends Employee{
	private double sal;
	private double bonus;
	public SalariedEmp(String nm,String dt,String ds,double sal,double bonus) {
		super(nm,dt,ds);
		System.out.println("In parametrised salariedemployee constructor");
		this.sal=sal;
		this.bonus=bonus;
		
	}
	public String toString() {
		return super.toString()+"\n Salary: "+sal+"\nBonus : "+bonus;
	}

}
