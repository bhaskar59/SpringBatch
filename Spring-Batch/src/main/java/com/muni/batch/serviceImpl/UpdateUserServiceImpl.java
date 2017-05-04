package com.muni.batch.serviceImpl;

import java.util.List;

import com.muni.batch.dao.UserDao;
import com.muni.batch.entity.User;
import com.muni.batch.service.UpdateUserService;

public class UpdateUserServiceImpl implements UpdateUserService{

	private UserDao userdao;
	
	public UserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public void Updatestatus(Integer userId) {
		// TODO Auto-generated method stub
		
	}

}
