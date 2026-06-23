package com.vanguard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vanguard.model.User;

@RestController
public class UserController {

    @GetMapping("/api/v1/users/{userId}")
    public User getUser(@PathVariable Long userId) {
        System.out.println("user ID = " + userId);
        return new User(userId, "Arsh");
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
	
	@GetMapping("/")
    public String testing() {
        return "OK";
    }
	
}
