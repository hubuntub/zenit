package com.github.hubuntub.zenit.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.github.hubuntub.zenit.model.User;

@Repository("userRepository")
public class UserRepository extends AbstractRepository<User> {
	
	// private static final String QUERY_GET_USER = "SELECT u FROM USER u ORDER BY u.username";
	private static final String QUERY_GET_USER = "from User";

	public List<User> getAll(){
		return entityManager.createQuery(QUERY_GET_USER).getResultList();
	}
}
