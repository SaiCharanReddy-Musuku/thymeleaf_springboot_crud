package com.sai.employeemgmtsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sai.employeemgmtsystem.*"})
@EnableJpaRepositories("com.sai.employeemgmtsystem.repository")
@EntityScan("com.sai.employeemgmtsystem.model")
public class EmployeemgmtsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemgmtsystemApplication.class, args);
	}

}
