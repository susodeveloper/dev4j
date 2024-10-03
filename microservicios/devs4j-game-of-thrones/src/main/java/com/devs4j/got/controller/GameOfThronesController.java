package com.devs4j.got.controller;

import com.github.javafaker.Faker;
import jakarta.annotation.PostConstruct;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/gameofthrones/characters")
public class GameOfThronesController {
    private final Faker faker = new Faker();
    private final List<String> characters = new ArrayList<>();

    @PostConstruct
    public void init() {
        for (int i = 0; i < 20; i++) {
            this.characters.add(this.faker.gameOfThrones().character());
        }
    }

    @GetMapping
    public ResponseEntity<List<String>> get() {
        return ResponseEntity.ok(this.characters);
    }
}
