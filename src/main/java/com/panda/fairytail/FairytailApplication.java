package com.panda.fairytail;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.panda.fairytail.mapper")
public class FairytailApplication {

	public static void main(String[] args) {
		SpringApplication.run(FairytailApplication.class, args);
	}
}
