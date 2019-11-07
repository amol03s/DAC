package com.trining.test;


import com.trining.beans.Book;
import com.trining.service.BookServiceImpl;

public class TestBook {

	public static void main(String[] args) {
		BookServiceImpl bs=new BookServiceImpl();
		Book b=bs.acceptData();
		System.out.println(b);

	}

}
