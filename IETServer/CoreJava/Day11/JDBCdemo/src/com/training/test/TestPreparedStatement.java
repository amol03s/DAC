package com.training.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestPreparedStatement {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root123");
			PreparedStatement ps=conn.prepareStatement("select * from users where role=?");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter role");
			String rl=sc.next();
			ps.setString(1,rl);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("Id : "+rs.getInt(1));
				System.out.println("Name : "+rs.getString(2));
				System.out.println("Password : "+rs.getString(3));
				System.out.println("Role : "+rs.getString(4));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
