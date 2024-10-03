package com.dev4j.config_client.controller;

import com.dev4j.config_client.config.DragonBallConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/application-name")
public class ApplicationController {
	private static final Logger log = LoggerFactory.getLogger(ApplicationController.class);

	@Autowired
	private DragonBallConfig dragonBallConfig;

	@GetMapping
	public ResponseEntity<String> getApplicationName() {
		log.info("Application name: {}", this.dragonBallConfig.getApplicationName());
		return ResponseEntity.ok(this.dragonBallConfig.getApplicationName());
	}
}
