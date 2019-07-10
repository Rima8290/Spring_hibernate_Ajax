package com.lti.training.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.training.entity.User;

@Repository
public class RegisterDao {

	@PersistenceContext
	private EntityManager entityManager;
	
    public int addUser(User user) {
    	User u  = entityManager.merge(user);
    	return u.getId();  //To fetch the auto Generated Id of the user
		}
    

	public List<User> fetch(String email) {
		
		Query q=entityManager.createQuery("select u from User u where u.email = : em");
		q.setParameter("em", email);
		List<User> list=q.getResultList();
		return list;
		 
	}
		 
}
