package com.roger.userregistrationapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.roger.userregistrationapp.model.User;

@Repository
@Transactional
public class UserDaoImpl extends AbstractSession implements UserDao{

	@Override
	public void saveUser(User user) {
		getSession().persist(user);
		
	}

	@Override
	public void deleteUser(String userId) {
		User user = getUser(userId);
		if (user != null) {
			getSession().delete(user);
		}
	}

	@Override
	public User getUser(String userId) {
		return (User) getSession().get(User.class, userId);
	}

}
