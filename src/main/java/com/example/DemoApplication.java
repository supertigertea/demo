package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@RequestMapping("/")
	public String greeting() {
		return "Hello World!";
	}


	public String hello(){
		return "";
	}
	public String fuck(){
		return "hello";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
