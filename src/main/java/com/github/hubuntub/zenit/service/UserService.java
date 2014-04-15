package com.github.hubuntub.zenit.service;

import java.util.List;

import com.github.hubuntub.zenit.model.User;

public interface UserService {

	List<User> getAll() throws Exception;

	User createUser(User user) throws Exception;
}
