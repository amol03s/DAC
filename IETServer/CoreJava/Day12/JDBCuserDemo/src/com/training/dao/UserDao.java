package com.training.dao;
import java.util.List;
import com.training.beans.MyUser;

public interface UserDao {
	public void closeConnection();
	public List<MyUser> displayAllUsers();
	public int updatePassword(int id, String ps);
}
