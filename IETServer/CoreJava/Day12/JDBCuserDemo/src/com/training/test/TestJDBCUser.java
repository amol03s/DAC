package com.training.test;

import java.util.List;
import java.util.Scanner;
import com.training.beans.MyUser;
import com.training.service.UserService;
import com.training.service.UserServiceImpl;

public class TestJDBCUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		UserService us=new UserServiceImpl(); 
		do {
		System.out.println("1.Register User\n2.Change PassWord\n3.Display All users\n4.Display My ID\n5.Delete User\n6.Exit");
		System.out.println("Choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			break;
		case 2:
			System.out.println("Enter ID:");
			int id=sc.nextInt();
			System.out.println("Enter new Password:");
			String ps=sc.next();
			System.out.println("Retype Password:");
			String rps=sc.next();
			if(ps.equals(rps)) {
				int n=us.updatePassword(id,ps);
				if(n>0) {
					System.out.println("Updattion Done..");
				}else {
					System.out.println("Updattion Not Done");
				}
				
			}else {
				System.out.println("Password Doesn't match");
			}
			break;
		case 3:
			List<MyUser> ulist=us.displayAll();
			for(MyUser u:ulist) {
				System.out.println(u);
			}
			break;
		case 4:
			break;
		case 5:
			break;
	        case 6:
			us.closeConnection();
			sc.close();
			System.exit(0);
			break;
				
		}
		}while(choice!=6);
	}

}
