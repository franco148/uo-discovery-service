package com.fral.uo.discovery.uodiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class UoDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UoDiscoveryServiceApplication.class, args);
	}
}
