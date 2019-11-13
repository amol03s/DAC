package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.beans.MyUser;

public class UserDaoImpl implements UserDao{
	static Connection conn=null;
	static PreparedStatement pst= null;
	static PreparedStatement psup=null;
	static {
		conn=MyConnection.getMyConnection();
		try {
			pst=conn.prepareStatement("select * from users");
			psup=conn.prepareStatement("update users set password=? where uid=?");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	public List<MyUser> displayAllUsers() {
		// TODO Auto-generated method stub
		try {
			ResultSet rs = pst.executeQuery();
			List<MyUser> ls= new ArrayList<>();
			while(rs.next()) {
				MyUser u=new MyUser(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
				ls.add(u);
				
			}
			return ls;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public int updatePassword(int id, String ps) {
		try {
			psup.setString(1, ps);
			psup.setInt(2, id);
			return psup.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}
	
	public void closeConnection() {
		MyConnection.closeConnection();
	}

	
}
