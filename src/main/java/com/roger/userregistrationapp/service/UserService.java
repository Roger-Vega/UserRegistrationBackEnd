package com.roger.userregistrationapp.service;

import java.util.List;

import com.roger.userregistrationapp.model.User;

public interface UserService {
	
	void saveUser(User user);
	
	void deleteUser(String userId);
	
	User getUser(String userId);
	
}
