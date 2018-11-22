package org.com.cay.spring.mvc.controller;

import org.com.cay.spring.mvc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@Autowired
	private HelloService helloService;
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		String hello = helloService.sayHello("caychen");
		return hello;
	}
	
	@RequestMapping("/success")
	public String success(){
		return "success";
	}
}
