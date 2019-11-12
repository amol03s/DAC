package com.training.service;

import java.util.Scanner;

import com.training.beans.MyUser;
import com.trainng.dao.UserDao;
import com.trainng.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    private UserDao udao;
	public UserServiceImpl() {
		super();
		this.udao = new UserDaoImpl();
	}

	@Override
	public int addNewRecord() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Id");
		int id=sc.nextInt();
		System.out.println("enter Name");
		String nm=sc.next();
		System.out.println("enter Password");
		String ps=sc.next();
		System.out.println("enter role");
		String rl=sc.next();
		MyUser ob=new MyUser(id,nm,ps,rl);
		return udao.insertData(ob);
		
		
	}

	@Override
	public int updateRecord(int id) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Name");
		String nm=sc.next();
		System.out.println("enter Password");
		String ps=sc.next();
		System.out.println("enter role");
		String rl=sc.next();
		MyUser ob=new MyUser(id,nm,ps,rl);	
		return udao.updateData(ob);
	}

	@Override
	public MyUser getById(int id) {
		return udao.getUserById(id);
		
	}

	@Override
	public void closeConnection() {
		udao.closeConnection();
		
	}

}
