package com.trining.beans;

public class Book {
	private int bkid;
	private String bknm;
	private Author a;
	
	public Book(int id,String nm,Author a) {
		this.bkid=id;
		this.bknm=nm;
		this.a=a;
	}
	
	public String toString() {
		return "Id : "+bkid+"\n Name : "+bknm+"\nAuthor "+a.toString();
		
	}

}
