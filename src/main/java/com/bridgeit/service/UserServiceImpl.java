package com.bridgeit.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeit.dao.UserDao;
import com.bridgeit.model.User;

public  class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public void register(User user) {
    userDao.register(user);
  }

  public User validateUser(User user) {
    return userDao.validateUser(user);
  }

}
