package com.training.test;

import java.util.Scanner;

import com.training.beans.MyUser;
import com.training.service.UserService;
import com.training.service.UserServiceImpl;

public class TestJDBC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		UserService us=new UserServiceImpl();
		do {
		System.out.println("1. Add new Record\n 2. update Record \n 3.exit\n");
		System.out.println("choice : ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
		      int n=us.addNewRecord();
		      if(n>0) {
		    	  System.out.println("Insertion done");
		      }
		      else {
		    	  System.out.println("Insertion not done"); 
		      }
		      break;
		case 2:
			  System.out.println("enter id");
			  int id=sc.nextInt();
			  MyUser u=us.getById(id);
			  if(u!=null) {
			      System.out.println(u);
			      System.out.println("do you want to update?");
			      String ans=sc.next();
			      if(ans.equals("y")) {
			          n=us.updateRecord(id);
			          if(n>0)
			          {
			    	      System.out.println("updation done");
			          }
			          else {
			    	     System.out.println("updation not done"); 
			          }
			      }
			  }else {
				  System.out.println("id not found");
			  }
			  
			   break;
		case 3:
			   us.closeConnection();
			   System.exit(0);
			   break;
		}
		}while(choice!=3);

	}

}
