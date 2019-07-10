package com.lti.training.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.training.dto.StatusDTO;
import com.lti.training.dto.UserDTO;
import com.lti.training.entity.User;
import com.lti.training.service.RegisterService;

@RestController
@EntityScan("com.lti")
public class RegisterController {

	@Autowired
	private  RegisterService registerService;
	
	@RequestMapping(path = "/register", method = RequestMethod.POST) 
	public StatusDTO register(@RequestBody UserDTO userDto) {
		StatusDTO status = registerService.register(userDto);
		return status;
	}
	
	@RequestMapping(path="/searchUser", method = RequestMethod.POST)
	public  List<User> fetch(@RequestParam("email") String email,
			              Map<String, Object> model){
		registerService.fetch(email);
		model.put(email, model);
		return null;
	}
}
