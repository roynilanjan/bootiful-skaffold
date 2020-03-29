package com.boot.skaffold;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootifulSkaffoldApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootifulSkaffoldApplication.class, args);
	}

	@GetMapping("/")
	public String sayHello(){

		return "Hello Spring boot !!!! Skaffolding  with Jib	";
	}

}
