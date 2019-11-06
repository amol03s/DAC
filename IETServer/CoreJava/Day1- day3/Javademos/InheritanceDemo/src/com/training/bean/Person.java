package com.training.bean;

public class Person {
	static {
		cnt=0;
	}
	/*{
		System.out.println("In init block");
	}*/
	private int id;
	private String name;
        static int cnt;
    
    public Person() {
    	System.out.println("In default person constructor");
    	//cnt++;
    	id=++cnt;
    	name=null;
    }
    public Person(String nm) {
    	System.out.println("In parametrised person constructor");
    	//cnt++;
    	id=++cnt;
    	name=nm;
    }
    public String toString() {
    	return "Id : "+this.id+"\nName: "+this.name;
    }
    
}
