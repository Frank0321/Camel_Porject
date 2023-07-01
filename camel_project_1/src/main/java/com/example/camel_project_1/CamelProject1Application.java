package com.example.camel_project_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:./camel-context.xml")
public class CamelProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(CamelProject1Application.class, args);
	}

}
