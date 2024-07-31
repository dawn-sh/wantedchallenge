package com.example.wanted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class WantedChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WantedChallengeApplication.class, args);
	}

}
