package com.bridgeit.service;

import com.bridgeit.model.User;

public interface UserService {

  void register(User user);

  User validateUser(User user);
}
