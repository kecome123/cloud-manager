package com.xunfang.coreDao;

import com.xunfang.coreModel.User;

public interface UserDao {
	public void insert(User user);
	public void delete(Long id);
	public User select(Long id);
}
