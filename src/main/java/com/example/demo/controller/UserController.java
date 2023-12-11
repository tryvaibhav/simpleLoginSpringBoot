package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.demo.User;
import com.example.demo.service.IUserService;

import jakarta.xml.ws.Response;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	public IUserService userSrv;
	@RequestMapping("/test")
	public void test()
	{
		System.out.println("test working");
	}
	@CrossOrigin
	@PostMapping("login")
	public ResponseEntity login(@RequestBody User user)
	{
		System.out.println(user.toString());
		
		User u=userSrv.login(user.getEmail(), user.getPswd());
		if(u==null)return ResponseEntity.ok(HttpStatus.NOT_FOUND);
		System.out.println(u);
		if(u.getRole().ordinal()==0)
		{
			System.out.println("Admin");
//			List<User> u2=userSrv.userList(user.getEmail(), user.getPswd());
//			System.out.println(u2);
//			if(u2!=null)return ResponseEntity.ok(u2);
		}
		if(u!=null)return ResponseEntity.ok(u);
		return ResponseEntity.ok(HttpStatus.NOT_FOUND);
	}
	@PostMapping("signup")
	public ResponseEntity singup(@RequestBody User user)
	{
		System.out.println(user.toString());
		
		User u=userSrv.signup(user);
		System.out.println(u);
		if(u!=null)return ResponseEntity.ok(u);
		return ResponseEntity.ok(HttpStatus.NOT_FOUND);
	}
	@PostMapping("list")
	public ResponseEntity userList(@RequestBody User user)
	{
		System.out.println(user.toString());
		
		List<User> u=userSrv.userList(user.getEmail(), user.getPswd());
		System.out.println(u);
		if(u!=null)return ResponseEntity.ok(u);
		return ResponseEntity.ok(HttpStatus.NOT_FOUND);
	}
}
