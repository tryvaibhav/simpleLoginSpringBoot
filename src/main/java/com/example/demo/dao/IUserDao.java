package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.demo.User;

@Repository
public interface IUserDao extends JpaRepository<User, Integer>{
	//public User login(String email,String pswd);
}
