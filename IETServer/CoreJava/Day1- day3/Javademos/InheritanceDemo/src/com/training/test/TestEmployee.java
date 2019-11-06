package com.training.test;

//import com.training.bean.Employee;
import com.training.bean.SalariedEmp;

public class TestEmployee {

	public static void main(String[] args) {
		//Employee e=new Employee("Kishori","Hr","Manager");
        //System.out.println(e);
		SalariedEmp se=new SalariedEmp("Kishori","Hr","Manager",34566.56,4567.89);
		System.out.println(se);
	}

}
