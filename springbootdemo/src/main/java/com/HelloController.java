package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public BeanDemo hello() {
		BeanDemo beanDemo = new BeanDemo();
		beanDemo.setUsername("小米");
		beanDemo.setPassword(123456);
		return beanDemo;
	}
}
