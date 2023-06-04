package com.sai.employeemgmtsystem;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootTest
@ComponentScan(basePackages = {"com.sai.employeemgmtsystem.*"})
@EnableJpaRepositories("com.sai.employeemgmtsystem.repository")
@EntityScan("com.sai.employeemgmtsystem.model")
@EnableAutoConfiguration
class EmployeemgmtsystemApplicationTests {

	@Test
	void contextLoads() {
	}

}
