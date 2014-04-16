package com.github.hubuntub.zenit.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractRepository<T> {

	@PersistenceContext
	protected EntityManager entityManager;

	public T persist(T t) {

		entityManager.persist(t);
		return t;
	}

	public T merge(T t) {

		return entityManager.merge(t);
	}

	public void remove(T t) {

		entityManager.remove(t);
	}
}