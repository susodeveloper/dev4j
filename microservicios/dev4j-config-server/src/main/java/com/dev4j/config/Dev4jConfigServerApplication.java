package com.dev4j.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Dev4jConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Dev4jConfigServerApplication.class, args);
	}

}
