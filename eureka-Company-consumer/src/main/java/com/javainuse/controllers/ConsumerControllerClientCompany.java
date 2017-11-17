package com.javainuse.controllers;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Controller
public class ConsumerControllerClientCompany {
	@Autowired
	private DiscoveryClient discoveryClient1,discoveryClient2,discoveryClient3,discoveryClient4,discoveryClient5,discoveryClient6;

	public void getCompany() throws RestClientException, IOException {
		List<ServiceInstance> instances1 = discoveryClient1.getInstances("company_a");
		List<ServiceInstance> instances2=discoveryClient2.getInstances("company_b");
		List<ServiceInstance> instances3=discoveryClient3.getInstances("company_c");
		List<ServiceInstance> instances4=discoveryClient4.getInstances("company_d");
		List<ServiceInstance> instances5=discoveryClient5.getInstances("company_e");
		List<ServiceInstance> instances6=discoveryClient6.getInstances("company_f");
		ServiceInstance serviceInstance1 = instances1.get(0);
	    ServiceInstance serviceInstance2 = instances2.get(0);
	    ServiceInstance serviceInstance3 = instances3.get(0);
	    ServiceInstance serviceInstance4 = instances4.get(0);
	    ServiceInstance serviceInstance5 = instances5.get(0);
	    ServiceInstance serviceInstance6 = instances6.get(0);
		String baseUrl1 = serviceInstance1.getUri().toString();
		String baseUrl2 = serviceInstance2.getUri().toString();
		String baseUrl3 = serviceInstance3.getUri().toString();
		String baseUrl4 = serviceInstance4.getUri().toString();
		String baseUrl5 = serviceInstance5.getUri().toString();
		String baseUrl6 = serviceInstance6.getUri().toString();
		baseUrl1 = baseUrl1 + "/companyA";
		baseUrl2=baseUrl2+"/companyB";
		baseUrl3=baseUrl3+"/companyC";
		baseUrl4=baseUrl4+"/companyD";
		baseUrl5=baseUrl5+"/companyE";
		baseUrl6=baseUrl6+"/companyF";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response1 = null;
		ResponseEntity<String> response2 = null;
		ResponseEntity<String> response3 = null;
		ResponseEntity<String> response4 = null;
		ResponseEntity<String> response5 = null;
		ResponseEntity<String> response6 = null;
		try {
			System.out.println(baseUrl1+"\n "+baseUrl2+"\n "+baseUrl3+"\n "+baseUrl4+"\n "+baseUrl5+"\n "+baseUrl6);
			response1 = restTemplate.exchange(baseUrl1, HttpMethod.GET, getHeaders(), String.class);
			response2 = restTemplate.exchange(baseUrl2, HttpMethod.GET, getHeaders(), String.class);
			response3 = restTemplate.exchange(baseUrl3, HttpMethod.GET, getHeaders(), String.class);
			response4 = restTemplate.exchange(baseUrl4, HttpMethod.GET, getHeaders(), String.class);
			response5 = restTemplate.exchange(baseUrl5, HttpMethod.GET, getHeaders(), String.class);
			response6 = restTemplate.exchange(baseUrl6, HttpMethod.GET, getHeaders(), String.class);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		System.out.println(response1.getBody());
		System.out.println(response2.getBody());
		System.out.println(response3.getBody());
		System.out.println(response4.getBody());
		System.out.println(response5.getBody());
		System.out.println(response6.getBody());
	}

	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}
}