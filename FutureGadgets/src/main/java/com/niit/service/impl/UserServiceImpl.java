package com.niit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.UserDao;
import com.niit.model.User;
import com.niit.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	public boolean login(User user) {
	
		// TODO Auto-generated method stub
		return userDao.login(user);
	}

}
