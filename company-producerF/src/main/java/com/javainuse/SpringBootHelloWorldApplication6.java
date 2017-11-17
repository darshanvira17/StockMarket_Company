package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootHelloWorldApplication6 {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication6.class, args);
	}
}