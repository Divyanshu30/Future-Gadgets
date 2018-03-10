package com.niit.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UserDao;
import com.niit.model.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao{
	private SessionFactory sessionFactory;
	public boolean login(User user) {
		// TODO Auto-generated method stub
		boolean flag= false;
		try
		{
		Session session =sessionFactory.openSession();
		flag=session.contains(user);
		session.flush();
		}
		catch(Exception w)
		{
			flag=false;
			
		}
		finally
		{
			return flag;
		}
	}
	

}
