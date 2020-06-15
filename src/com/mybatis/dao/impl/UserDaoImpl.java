package com.mybatis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.dao.UserMapper;
import com.mybatis.entity.User;
import com.mybatis.test.UserTest;

public class UserDaoImpl implements UserMapper {

	@Override
	public List<User> findUserList() {
		// 创建会话工厂并加载配置文件
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(
				UserTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
		// 通过SqlSessionFactory创建SqlSession
		SqlSession session = ssf.openSession();
		// 通过SqlSession操作数据库
		// 第一个参数：Statement的位置，等于namespace+Statement的id
		// 第二个参数：传入的参数
		List<User> list = session.selectList("findUserList");
		return list;
	}

	@Override
	public User findUserById(int id) {
		// 创建会话工厂并加载配置文件
		SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(
				UserTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
		// 通过SqlSessionFactory创建SqlSession
		SqlSession session=ssf.openSession();
		// 通过SqlSession操作数据库
		// 第一个参数：Statement的位置，等于namespace+Statement的id
		// 第二个参数：传入的参数
		User user = session.selectOne("findUserById",id);
		return user;
	}

	@Override
	public void insertUser(User user) {
		// 创建会话工厂并加载配置文件
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(
				UserTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
		// 通过SqlSessionFactory创建SqlSession
		SqlSession session=ssf.openSession();
		// 通过SqlSession操作数据库
		// 第一个参数：Statement的位置，等于namespace+Statement的id
		// 第二个参数：传入的参数
		session.insert("insertUser",user);
		session.commit();
	}

	@Override
	public void insertFullUser(User user) {
		// 创建会话工厂并加载配置文件
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(
				UserTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
		// 通过SqlSessionFactory创建SqlSession
		SqlSession session=ssf.openSession();
		// 通过SqlSession操作数据库
		// 第一个参数：Statement的位置，等于namespace+Statement的id
		// 第二个参数：传入的参数
		session.insert("insertUser",user);
		session.commit();
	}

	@Override
	public void updateUser(User user) {
		// 创建会话工厂并加载配置文件
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(
				UserTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
		// 通过SqlSessionFactory创建SqlSession
		SqlSession session=ssf.openSession();
		// 通过SqlSession操作数据库
		// 第一个参数：Statement的位置，等于namespace+Statement的id
		// 第二个参数：传入的参数
		session.update("updateUser",user);
		//提交事物
		session.commit();
	}

	@Override
	public void deleteUser(int id) {
		// 创建会话工厂并加载配置文件
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(
				UserTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
		// 通过SqlSessionFactory创建SqlSession
		SqlSession session=ssf.openSession();
		// 通过SqlSession操作数据库
		// 第一个参数：Statement的位置，等于namespace+Statement的id
		// 第二个参数：传入的参数
		session.delete("deleteUser",id);
		//提交事物
		session.commit();
	}

	@Override
	public User findUserInfoById(int id) {
		// 创建会话工厂并加载配置文件
		SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(
				UserTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
		// 通过SqlSessionFactory创建SqlSession
		SqlSession session=ssf.openSession();
		// 通过SqlSession操作数据库
		// 第一个参数：Statement的位置，等于namespace+Statement的id
		// 第二个参数：传入的参数
		User user = session.selectOne("findUserInfoById",id);
		return user;
	}
	
}
