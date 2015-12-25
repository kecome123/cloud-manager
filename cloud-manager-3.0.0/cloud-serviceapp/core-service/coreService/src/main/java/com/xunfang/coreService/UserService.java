package com.xunfang.coreService;

import com.xunfang.coreModel.User;

public interface UserService {
	public void create(User user);
	public User get(Long id);
	public void delete(Long id);
}
