package com.github.hubuntub.zenit.service;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.hubuntub.zenit.model.User;
import com.github.hubuntub.zenit.repository.UserRepository;
@Service("userService")
@Transactional(readOnly = false)
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	@Override
	public List<User> getAll() throws Exception {
		return userRepository.getAll();
	}

	@Override
	public User createUser(User user) throws ParseException {
		return userRepository.merge(user);
	}

}
