package com.training.service;

import java.util.List;

import com.training.beans.MyUser;

public interface UserService {
	public void closeConnection();

	public List<MyUser> displayAll();

	public int updatePassword(int id, String ps); 
}
