package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {
	@RestController
	public class HelloContoler {
		@GetMapping(path="/hello")
		public String Hellowoled(){
			return "helooooooooooooooooooo dineth backend ok springboot thama karanna wenne";
		}
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
