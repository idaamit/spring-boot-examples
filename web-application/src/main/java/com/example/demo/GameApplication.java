package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

//@SpringBootApplication
//@SpringBootConfiguration
@EnableAutoConfiguration
@Import({GameConfig.class})
@EnableAspectJAutoProxy
public class GameApplication {


	public static void main(String[] args) {
		final ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(GameApplication.class, args);
		final String[] beans = configurableApplicationContext.getBeanDefinitionNames();
/*		Arrays.sort(beans);
		for (String bean : beans) {
			System.out.println(bean);
		}*/
	}
}
