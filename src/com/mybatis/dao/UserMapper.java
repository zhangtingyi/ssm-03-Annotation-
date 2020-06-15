package com.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.mybatis.entity.User;

public interface UserMapper {
	
	@Select("SELECT `user`.id,`user`.username,`user`.realname,	role.`name`,`user`.remarks FROM `user` INNER JOIN role ON `user`.role = role.id")  
	public List<User> findUserList();
	@Select("SELECT `user`.id,`user`.username,`user`.realname,	role.`name`,`user`.remarks FROM `user` INNER JOIN role ON `user`.role = role.id WHERE `user`.id = #{id}")  
	public User findUserById(int id);
	@Insert("INSERT INTO user(username,password,remarks,role,realname) VALUES (#{username},#{password},#{remarks},#{role},#{realname})")
	public void insertUser(User user);

	@Insert("INSERT INTO user(id,username,password,remarks,role,realname) VALUES (#{id};#{username},#{password},#{remarks},#{role},#{realname})")
	public void insertFullUser(User user);

	@Update("update user set username=#{username},password=#{password},remarks=#{remarks},role=#{role},realname=#{realname} where id=#{id}")
	public void updateUser(User user);
	@Delete("delete from user where id=#{id}")  
	public void deleteUser(int id);
	
	@Select("SELECT * FROM `user` WHERE `user`.id = #{id}")  
	public User findUserInfoById(int id);

}
