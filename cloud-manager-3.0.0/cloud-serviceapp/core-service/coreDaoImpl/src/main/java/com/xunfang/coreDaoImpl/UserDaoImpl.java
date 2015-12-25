package com.xunfang.coreDaoImpl;

import com.xunfang.coreDao.UserDao;
import com.xunfang.coreModel.User;

public class UserDaoImpl implements UserDao{
	
	@Override
	public void insert(User user) {
		System.out.println("insert user name = " + user.getName());
	}

	@Override
	public void delete(Long id) {
		System.out.println("delete user id=" + id);
	}

	@Override
	public User select(Long id) {
		User user = new User();
		user.setName("小王...");
		user.setAge(56);
		user.setId(7775L);
		return user;
	}
	
}
