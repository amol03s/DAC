package com.training.test;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.training.beans.Employee;
import com.training.service.EmployeeService;
import com.training.service.EmployeeServiceImpl;

public class TestClass {
	public static void main(String[] args) {
		Map<Integer, Employee> hm=new HashMap<>();
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
		case 1: es.addEmployee(hm);
			break;
		case 2:System.out.println("enter the id");
			   int id= sc.nextInt();
			   if(es.deleteEmployee(hm, id))
			   {
				   System.out.println("deleted succesfully");
			   }
			   else
				   System.out.println("not found");
			break;
		case 3: System.out.println("enter the id");
 				id= sc.nextInt();
 				Employee e=es.searchEmployee(hm, id);
 				if(e!=null)
 				{
 					System.out.println("emp is found"+e);
 				}
 				else
 					System.out.println("not found!!");
 				
			break;
		case 4:  System.out.println("enter the id");
		 		 id= sc.nextInt();
		 		 System.out.println("enter the sal");
		 		double sal=sc.nextDouble();
		 		if(hm.containsKey(id))
		 		{
		 		     e=hm.get(id);
		 			e.setSal(sal);
		 			hm.put(id, e);
		 		}
		 		break;
		case 5:System.out.println("enter the id");
				id= sc.nextInt();
				if(hm.containsKey(id))
		 		{
		 		     e=hm.get(id);
		 			System.out.println("found"+e);
		 		}
				else
					System.out.println("not found");
			
			break;
		case 6:System.out.println("enter the name");
		       String s= sc.next();
		       e=es.searchEmployeeName(hm, s);
		       if(e!=null)
				{
					System.out.println("emp is found"+e);
				}
				else
					System.out.println("not found!!");
			break;
		case 7:System.out.println(hm);
			break;
		case 8: System.exit(0);
			break;
			
		}
		}while(choice!=8);	
	}
	}


