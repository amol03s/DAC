package com.training.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.training.beans.Employee;
import com.training.service.EmployeeService;
import com.training.service.EmployeeServiceImpl;

public class Test {
	public static void main(String[] args)
	{
		List<Employee> eList= new ArrayList<>();
		EmployeeService es= new EmployeeServiceImpl();
		int choice=0;
		do{
		System.out.println("1. Add Employee\n"
				+ "2. Delete Employee\n"
				+ "3. Search Employee\n"
				+ "4. Modify Employee\n"
				+ "5. Display By Id\n"
				+ "6. Display By Name\n"
				+ "7. Display All\n"
				+ "8. Exit");
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter choice :");
		choice=sc.nextInt();
		switch (choice) {
		case 1:
			es.addEmployee(eList);
			break;
		case 2:
			System.out.print("Enter id : ");
			int id = sc.nextInt();
			
			boolean ans = es.deleteEmployee(eList,id);
			if(ans)
			{
				System.out.println("Deleted successfuly");
			}
			else
			{
				System.out.println("Not found .");
			}
			break;
		case 3:
			System.out.print("Enter id : ");
			id = sc.nextInt();
			int pos=es.searchEmployee(eList, id);
			if(pos!=-1)
			{
			System.out.println("found at position : "+pos);
			System.out.println(eList.get(pos));
			}
			else
			{
				System.out.println("Not found");
			}
			break;
		case 4:
			System.out.print("Enter id : ");
			id = sc.nextInt();
			pos = es.searchEmployee(eList, id);
			if(pos!=-1)
			{
				System.out.println("Enter salary : ");
				double sal=sc.nextDouble();
				Employee e=eList.get(pos);
				e.setSal(sal);
				System.out.println("modification done");
			}
			else
			{
				System.out.println("Not found ..");
			}
			break;
		case 5:
			System.out.print("Enter id : ");
			id = sc.nextInt();
			pos=es.searchEmployee(eList, id);
			if(pos!=-1)
			{
				System.out.println(eList.get(pos));
			}
			else
			{
				System.out.println("Not found ..");
			}
			break;
		case 6:
			System.out.print("Enter Name : ");
			String name = sc.next();
			Employee e1 = es.searchEmployeeName(eList, name);
			if(e1!=null)
			{
				System.out.println(e1);
			}
			else
			{
				System.out.println("Not found ..");
			}
			break;
		case 7:
			System.out.println(eList);
			break;
		case 8:
			System.exit(0);
			break;

		default:
			break;
		}
		}while(choice!=8);
		
	}
}
