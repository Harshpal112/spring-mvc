package com.bridgeit.dao;

import com.bridgeit.model.User;

public interface UserDao {

	  void register(User user);

	  User validateUser(User user);
	}
