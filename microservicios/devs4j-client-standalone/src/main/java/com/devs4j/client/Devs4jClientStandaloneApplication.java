package com.devs4j.client;

import com.devs4j.client.clients.DragonBallCharacterClient;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.ResponseEntity;

@SpringBootApplication
@EnableFeignClients
public class Devs4jClientStandaloneApplication implements ApplicationRunner {
	private static final Logger log = LoggerFactory.getLogger(Devs4jClientStandaloneApplication.class);
	@Autowired
	private EurekaClient eurekaClient;

	@Autowired
	private DragonBallCharacterClient dragonBallCharacterClient;

	public static void main(String[] args) {
		SpringApplication.run(Devs4jClientStandaloneApplication.class, args);
	}

	/***
	 * Cliente Eureka
	 * @param args
	 * @throws Exception
	 */
//	@Override
//	public void run(ApplicationArguments args) throws Exception {
//		final Application application = this.eurekaClient.getApplication("devs4j-dragon-ball");
//		log.info("Application: {}", application.getName());
//		application.getInstances().forEach(instance -> {
//			log.info("Instance: {}", instance.getIPAddr());
//		});
//
//	}

	/***
	 * Cliente Feign
	 * @param args
	 * @throws Exception
	 */
	@Override
	public void run(ApplicationArguments args) throws Exception {
		for (int i = 0; i < 10; i++) {
			final ResponseEntity<String> applicationName = this.dragonBallCharacterClient.getApplicationName();
			log.info("Status: {} Application name: {}", applicationName.getStatusCode(), applicationName.getBody());
		}

	}

}
