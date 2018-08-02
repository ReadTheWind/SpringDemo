package com.sm.controller;

import com.sm.entity.User;
import com.sm.service.UserServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liuhuan
 * 用户controller
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserServcie userServcie;

	@GetMapping(value = "/getAll")
	public List<User> getAll(){
		List<User> users=userServcie.getAll();
		return  users;
	}
	@GetMapping(value = "/getAll2")
	public String getAll2(){
		return  "json";
	}

}
