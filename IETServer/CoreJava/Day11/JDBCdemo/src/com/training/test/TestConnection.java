package com.training.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestConnection {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/test";
			Connection conn=DriverManager.getConnection(url,"root","root123");
			if(conn!=null) {
				System.out.println("connection done");
			}
			else {
				System.out.println("Connection not done");
			}
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from users");
			while(rs.next()) {
				System.out.println("Id : "+rs.getInt(1));
				System.out.println("Name : "+rs.getString(2));
				System.out.println("Password : "+rs.getString(3));
				System.out.println("Role : "+rs.getString(4));
			}
			rs.beforeFirst();
			while(rs.next()) {
				System.out.println("Id : "+rs.getInt(1));
				System.out.println("Name : "+rs.getString(2));
				System.out.println("Password : "+rs.getString(3));
				System.out.println("Role : "+rs.getString(4));
			}
			Scanner sc=new Scanner(System.in);
			System.out.println("enter role");
			String rl=sc.next();
			String sql="select * from users where role='"+rl+"'";
			ResultSet rs1=st.executeQuery(sql);
			while(rs1.next()) {
				System.out.println("Id : "+rs1.getInt(1));
				System.out.println("Name : "+rs1.getString(2));
				System.out.println("Password : "+rs1.getString(3));
				System.out.println("Role : "+rs1.getString(4));
			}
			System.out.println("enter Id");
			int id=sc.nextInt();
			System.out.println("enter Name");
			String nm=sc.next();
			System.out.println("enter Password");
			String ps=sc.next();
			System.out.println("enter role");
			rl=sc.next();
			String sql1="insert into users values("+id+",'"+nm+"','"+ps+"','"+rl+"')";
			int n=st.executeUpdate(sql1);
			if(n>0) {
				System.out.println("Insertion done");
			}
			else {
				System.out.println("Insertion not  done");
			}

			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
