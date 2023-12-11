package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.dao.IUserDao;
import com.example.demo.demo.Roles;
import com.example.demo.demo.User;
import com.example.demo.service.IUserService;

@SpringBootTest
class SimpleLogin2ApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	
//	@MockBean
//	IUserDao userRepo;
//	
//	@DataJpaTest
//	private IUserDao userdao;
	
	IUserDao userdao=Mockito.mock(IUserDao.class);
	//IUserService userServ=Mockito.mock(IUserService.class);
	
	@Autowired
	IUserService userServ;	
	private User user;
	
	@BeforeEach
	public void setup() {
		user=new User();
		System.out.println("before each");
		user.setEmail("v@gmail.com");
		user.setId(1);
		user.setName("v");
		user.setPswd("v");
		user.setRole(Roles.Admin);
	}
	
	 @DisplayName("JUnit test for save employees operation")
	 @Test
	 public void givenEmployeesList_whenFindAll_thenEmployeesList(){
	 {
		 System.out.println(user.toString());
		 userServ.signup(user);
		 User savedUser=userServ.login("v@gmail.com","v");
		 System.out.println(savedUser.toString());
//		 assertThat(savedUser.getEmail().isEqualTo("v@gmail.comm");
	 }
	 
	 }
	
//	 @DisplayName("JUnit test for get all employees operation")
//	@Test
//	void testLogin(){
//	  User	u=userServ.login("v@gmail.com", "v");
//		System.out.println(u.toString());
//	}
	
	
}
