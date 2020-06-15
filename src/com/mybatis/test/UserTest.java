package com.mybatis.test;

import java.util.List;

import org.junit.Test;

import com.mybatis.dao.UserMapper;
import com.mybatis.dao.impl.UserDaoImpl;
import com.mybatis.entity.User;

public class UserTest {
	
	@Test
	public void FindUserTest() {
		UserMapper userdao=new UserDaoImpl();
		//查询所有用户信息
		List<User> list = userdao.findUserList();
		System.out.println(list);
		
		//查询一条用户信息
		User user=userdao.findUserById(1);
		System.out.println(user);
		//增加一条用户信息


		//userdao.insertUser(new User("Cindy","999999999","初级管理员","实习","辛迪"));
		User user1 = (new User("Cindy","999999999","初级管理员","实习","辛迪"));
		user1.setId(13);
		userdao.insertUser(user1);
		//修改一条用户信息
		User user0 = userdao.findUserInfoById(13);


		user0.setUsername("Jo");
		user0.setPassword("88888888");
		user0.setRemarks("");
		user0.setRole("1");;
		user0.setRealname("乔");;
		userdao.updateUser(user0);
		//删除一条用户信息
		userdao.deleteUser(14);
	}
}
