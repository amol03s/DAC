package com.training.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private int id;
	private String nm;
	private Date dt;
	public Employee(int id, String nm, Date dt) {
		super();
		this.id = id;
		this.nm = nm;
		this.dt = dt;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String s=sdf.format(this.dt);
		return "Employee [id=" + id + ", nm=" + nm + ", dt=" + s + "]";
	}

}
