package net.back;

import net.back.utils.API;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LaPiedthoneIjApplication {

	public static void main(String[] args) {
		API.init();
		SpringApplication.run(LaPiedthoneIjApplication.class, args);
	}

}
