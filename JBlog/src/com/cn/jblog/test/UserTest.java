package com.cn.jblog.test;

import org.junit.Before;
import org.junit.Test;

import com.cn.jblog.model.User;
import com.cn.jblog.service.UserService;
import com.cn.jblog.utils.MsgResponse;

public class UserTest {

	private UserService userService = new UserService();
	
	@Before
	public void init(){
		TestInitDataSource.init();
	}
	
	@Test
	public void saveUser(){
		User user = new User();
		user.setUserId("USER0102018090901");
		user.setUserName("wj");
		boolean b = userService.saveUser(user);
		if(b){
			System.out.println(MsgResponse.success().toString());
		}
	}
}
