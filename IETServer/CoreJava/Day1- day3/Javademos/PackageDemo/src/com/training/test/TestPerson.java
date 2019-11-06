package com.training.test;
import com.training.bean.Person;

public class TestPerson {
	static {
		System.out.println("In static block");
	}

	public static void main(String[] args) {
       Person p=new Person("Kishori");
       final int i=10;
       Person p1=new Person("Rajan");
       //i=34; //error
       Person p2=new Person("Revati");
       System.out.println(p);
       System.out.println(p1);
       System.out.println(p2);
	}

}
