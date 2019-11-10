package com.training.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.training.beans.Employee;
import com.training.service.EmployeeService;
import com.training.service.EmployeeServiceImpl;

public class TestSerialization {

	public static void main(String[] args) {
		List<Employee> elist=new ArrayList<>();
		EmployeeService es=new EmployeeServiceImpl();
		File f=new File("EmpData.txt");
		if(f.exists())
		{
			es.readFile(f,elist);
		}
		System.out.println("Data length"+elist.size());
		Scanner sc=new Scanner(System.in);
		int ch=0;
		do
		{
			System.out.println("1.Add new employee");
			System.out.println("2.Display all employee");
			System.out.println("3.Exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				boolean ans=es.addEmployee(elist);
				if(ans)
				{
					System.out.println("Added Successfully");
				}
				else
				{
					System.out.println("Error Occurred");
				}
				break;
			case 2:
				System.out.println(elist);
				break;
			case 3:
					es.writeFile(f,elist);
					System.out.println("Data return successfully");
					sc.close();
					System.exit(0);
				break;
			}
		}while(ch!=3);
			
	}

}
