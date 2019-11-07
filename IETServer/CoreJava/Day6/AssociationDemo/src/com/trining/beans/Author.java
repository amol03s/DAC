package com.trining.beans;

public class Author {
	int aid;
	String anm;
	
	public Author(int id,String name) {
		this.aid=id;
		this.anm=name;
	}
    
	public String toString() {
		return "Auth Id : "+aid+"\n Auth Name : "+anm;
	}
}
