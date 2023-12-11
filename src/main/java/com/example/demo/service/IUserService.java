package com.example.demo.service;

import java.util.List;

import com.example.demo.demo.User;

public interface IUserService {
	public User login(String email,String pswd);
	
	public List<User> userList(String email,String pswd);

	public User signup(User user);
}
