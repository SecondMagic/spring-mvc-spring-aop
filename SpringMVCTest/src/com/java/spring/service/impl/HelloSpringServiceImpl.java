package com.java.spring.service.impl;

import org.springframework.stereotype.Service;

import com.java.spring.service.HelloSpringService;

@Service
public class HelloSpringServiceImpl implements HelloSpringService{

	@Override
	public String printHello(String xx) {
		// TODO Auto-generated method stub
		System.out.println("Hello Spring,this is impl");
		return "123";
	}

}
