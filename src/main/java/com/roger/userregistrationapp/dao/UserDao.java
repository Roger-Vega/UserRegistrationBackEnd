package com.roger.userregistrationapp.dao;

import java.util.List;

import com.roger.userregistrationapp.model.User;

public interface UserDao {
	
	void saveUser(User user);
	
	void deleteUser(String userId);
	
	User getUser(String userId);

}
