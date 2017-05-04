package com.muni.batch.dao;

import java.util.List;

import com.muni.batch.entity.User;

public interface UserDao {
	
	public List<User> getAllUsers();
	
	public void Updatestatus(Integer userId);

}
