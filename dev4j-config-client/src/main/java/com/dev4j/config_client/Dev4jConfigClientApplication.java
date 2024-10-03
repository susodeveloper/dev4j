package com.dev4j.config_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class Dev4jConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Dev4jConfigClientApplication.class, args);
	}

}
