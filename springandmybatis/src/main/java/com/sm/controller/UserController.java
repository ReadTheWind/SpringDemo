package com.sm.controller;

import com.sm.entity.User;
import com.sm.service.UserServcie;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Restful风格
 * @author liuhuan
 * 用户controller
 */
@RestController
@RequestMapping("/user")
public class UserController {

	private static Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	UserServcie userServcie;

	/**
	 *返回json
	 * @return list
	 */
	@GetMapping(value = "/getAll")
	public List<User> getAll(){
		logger.debug("*******************-------------This is debug message.进入usercontrolelr,getall方法------------***************");
		List<User> users=userServcie.getAll();
		return  users;
	}

	/**
	 *返回json
	 * @return string
	 */
	@GetMapping(value = "/getAll2")
	public String getAll2(){
		// 记录info级别的信息
		logger.info("*******************-------------This is info message.进入usercontrolelr,getall方法------------***************");
		// 记录error级别的信息
		logger.error("*******************-------------This is error message.进入usercontrolelr,getall方法------------***************");
		return  "json";
	}

}
