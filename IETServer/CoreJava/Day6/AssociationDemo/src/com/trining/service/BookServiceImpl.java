package com.trining.service;

import java.util.Scanner;

import com.trining.beans.Author;
import com.trining.beans.Book;

public class BookServiceImpl implements BookService {
	public  Book acceptData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book id");
		int id=sc.nextInt();
		System.out.println("Enter Book name");
		String nm=sc.next();
		System.out.println("Enter Author id");
		int aid=sc.nextInt();
		System.out.println("Enter Author name");
		String anm=sc.next();
		Author ob=new Author(aid,anm);
		Book b=new Book(id,nm,ob);
		return b;
	}

}
