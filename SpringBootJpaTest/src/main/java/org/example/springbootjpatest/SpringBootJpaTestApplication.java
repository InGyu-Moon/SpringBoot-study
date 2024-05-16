package org.example.springbootjpatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"test.test"})
@EntityScan("test.test")
public class SpringBootJpaTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaTestApplication.class, args);
	}

}
