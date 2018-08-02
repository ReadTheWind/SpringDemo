package com.sm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/t1")
	public void test(){
		System.out.print("111111111111");
	}

	@RequestMapping("/t2")
	public String test2(){

		return "test";
	}
}
