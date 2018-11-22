package org.com.cay.spring.mvc.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public String sayHello(String name){
		return  "hello " + name;
	}
}
