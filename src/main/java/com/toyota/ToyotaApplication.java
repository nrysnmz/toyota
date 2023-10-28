package com.toyota;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ToyotaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(ToyotaApplication.class, args);

	}

}
