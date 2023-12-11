package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IUserDao;
import com.example.demo.demo.User;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	public IUserDao userdao;
	@Override
	public User login(String email, String pswd) {
		// TODO Auto-generated method stub
		Iterable<User>userIterator=userdao.findAll();
		for (User user : userIterator) {
			//System.out.println(user.toString());
			if(user.getEmail().equals(email) && user.getPswd().equals(pswd) )
				return user;
		}
		return null;
	}
	@Override
	public User signup(User user) {
		// TODO Auto-generated method stub
		return userdao.save(user);
	}
	@Override
	public List<User> userList(String email, String pswd) {
		// TODO Auto-generated method stub
		Iterable<User>userIterator=userdao.findAll();
		
		return (List<User>) userIterator;
	}
	
	

}
