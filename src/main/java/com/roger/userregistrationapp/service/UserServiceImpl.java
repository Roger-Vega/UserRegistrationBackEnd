package com.roger.userregistrationapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roger.userregistrationapp.dao.UserDao;
import com.roger.userregistrationapp.model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao _userDao;
	
	@Override
	public void saveUser(User user) {
		_userDao.saveUser(user);
		
	}

	@Override
	public void deleteUser(String userId) {
		_userDao.deleteUser(userId);
		
	}

	@Override
	public User getUser(String userId) {
		return _userDao.getUser(userId);
	}

}
