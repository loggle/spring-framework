package com.loggle.spring.demo;

import com.loggle.spring.demo.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("contextA.xml");
		DemoService demoService = context.getBean(DemoService.class);

		demoService.hello();
	}
}
