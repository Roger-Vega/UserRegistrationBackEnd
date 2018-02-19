package com.roger.userregistrationapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

import com.roger.userregistrationapp.model.User;
import com.roger.userregistrationapp.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService _userService;
	
	//Save user
	@CrossOrigin
	@RequestMapping(value = "/", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<?> saveUser(@RequestBody User user, UriComponentsBuilder ucBuilder){
		
		//Only numbers for userId and its length > 9
		if (!(user.getUserId().matches("[0-9]+")) || !(user.getUserId().length() > 9)) {
			return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE); 
		}
		
		if(_userService.getUser(user.getUserId()) != null) {
			return new ResponseEntity<String>(HttpStatus.FOUND);
		}
		_userService.saveUser(user);
        return new ResponseEntity<String>(HttpStatus.CREATED);
	}
	
	//Find user
	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<User> getUser(@PathVariable("id") String id){
		
		User user = _userService.getUser(id);
		if (user == null) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	//Delete user
	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
    public ResponseEntity<?> deleteUser(@PathVariable("id") String id) {
		User user = _userService.getUser(id);
        if (user == null) {        	
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        
        _userService.deleteUser(id);
        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
    }
	
}
