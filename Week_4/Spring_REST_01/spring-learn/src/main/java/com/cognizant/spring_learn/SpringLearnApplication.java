package com.cognizant.spring_learn;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) {
		Logger logger=LoggerFactory.getLogger("SpringLearnApplication.class");
		ApplicationContext context =new ClassPathXmlApplicationContext("country.xml");
		
		String[] countryIds = context.getBeanDefinitionNames();
	    for (String id : countryIds) {
	        Object bean = context.getBean(id);
	        if (bean instanceof country) {
	            logger.info("Country: {}",bean.toString());
	        }
	    }
	    
//		SpringApplication.run(SpringLearnApplication.class, args);
	}

}
