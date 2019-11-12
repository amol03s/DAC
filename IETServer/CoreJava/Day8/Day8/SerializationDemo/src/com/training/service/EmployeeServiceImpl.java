package com.training.service;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;
import com.training.beans.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	public void readFile(File f, List<Employee> elist) {
		try (ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));)
			{
			try
			{
			while(true)
			{
				Employee e=(Employee)ois.readObject();
				elist.add(e);
			}
			}catch(EOFException e)
			{
				System.out.println("Reached to end of the file");
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	public boolean addEmployee(List<Employee> elist)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter salary");
		double sal=sc.nextDouble();
		
		Employee e=new Employee(id,name,sal);
		elist.add(e);
		
		return true;
	}
	
	public void writeFile(File f,List<Employee> elist)
	{
		try (
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(f));
			)
		{
			for(Employee e:elist)
			{
				oos.writeObject(e);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
