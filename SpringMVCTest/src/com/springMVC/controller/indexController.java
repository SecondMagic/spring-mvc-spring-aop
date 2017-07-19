package com.springMVC.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.spring.service.HelloSpringService;

@Controller
public class indexController{
	@Autowired
	HelloSpringService helloSpringService;
	
	@RequestMapping( value="/index")
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1)
			throws Exception {
		// TODO Auto-generated method stub
		ModelAndView model=new ModelAndView();
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("config/applicationContext.xml");  
//		HelloSpringService helloSpringService=(HelloSpringService)ctx.getBean("userService");
		helloSpringService.printHello("123");
		model.addObject("demoStr", "HelloWorld");
		model.setViewName("index");
		return model;
	}

}
