package com.panda.clienttwo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClienttwoApplication {
	@Value("${server.port}")
	String port;
	@RequestMapping("/service02")
	public String home(@RequestParam String name) {
		return "hello "+name+",i am from port:" +port;
	}
	public static void main(String[] args) {
		SpringApplication.run(ClienttwoApplication.class, args);
	}
}
