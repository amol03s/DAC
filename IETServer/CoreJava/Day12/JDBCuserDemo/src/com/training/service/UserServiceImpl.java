package com.training.service;

import java.util.List;

import com.training.beans.MyUser;
import com.training.dao.UserDao;
import com.training.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
	private UserDao udao;
	public UserServiceImpl() {
		super();
		udao=new UserDaoImpl();
	}
	public List<MyUser> displayAll(){
		return udao.displayAllUsers();
	}
	public int updatePassword(int id, String ps) {
		return udao.updatePassword(id,ps);
	}
	public void closeConnection() {
		udao.closeConnection();
	}
	
}
