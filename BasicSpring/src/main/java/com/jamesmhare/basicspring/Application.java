package com.jamesmhare.basicspring;

import com.jamesmhare.basicspring.model.Farm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		Farm theFarm = context.getBean(Farm.class);

		theFarm.getCow().speak();

		Farm newFarm = context.getBean(Farm.class);

		newFarm.getCow().speak();
	}

}
