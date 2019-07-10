package com.lti.training.service;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.training.dao.RegisterDao;
import com.lti.training.dto.StatusDTO;
import com.lti.training.dto.UserDTO;
import com.lti.training.entity.User;

//Business Logic

@Service  //same as @Component
public class RegisterService {

	//@Autowired
	//User user;
	
	@Autowired
	private RegisterDao registerDao;
	
	@Transactional
	public StatusDTO register(UserDTO userDTO) {
		//Copying the data from dto to entity
		User user = new User();
		user.setName(userDTO.getName());
		user.setAge(userDTO.getAge());
		user.setEmail(userDTO.getEmail());
		
		int id = registerDao.addUser(user);
		
		StatusDTO status = new StatusDTO();
		status.setId(id);
		status.setMessage("all good!");
		return status;
		

	}
	@Transactional
	public List<User> fetch(String email) {
		return null;
		
	}

	
}
