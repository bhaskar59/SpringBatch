package com.muni.batch.service;

import java.util.List;

import com.muni.batch.entity.User;

public interface UpdateUserService {

	public List<User> getAllUsers();
	
	public void Updatestatus(Integer userId);

}
