package com.sm.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 非restful风格controlelr
 * 返回json需要用@ResponseBody注解
 * @author liuhuan
 *
 */
@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/t1")
	public void test(){
		System.out.print("111111111111");
	}

	/**
	 * 返回test.jsp
	 * @return
	 */
	@RequestMapping("/t2")
	public String test2(){
		return "test";
	}


	/**
	 * 返回json字符串
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/t3")
	public String test3(){
		return "test";
	}
}
