package com.javainuse;

import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;
import com.javainuse.controllers.ConsumerControllerClientCompany;
@SpringBootApplication
public class CompanyDiscovery {
	public static void main(String[] args) throws RestClientException, IOException {
		ApplicationContext ctx1 = SpringApplication.run(
				CompanyDiscovery.class, args);
		
		ConsumerControllerClientCompany consumerControllerClientCompany=ctx1.getBean(ConsumerControllerClientCompany.class);
		System.out.println(consumerControllerClientCompany);
		consumerControllerClientCompany.getCompany();
	}
	@Bean
	public  ConsumerControllerClientCompany  consumerControllerClientCompany()
	{
		return new ConsumerControllerClientCompany();
	}
}
