package com.vanguard.controller;

import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> health() {
    	return ResponseEntity.ok()
            .header("Content-Type", "text/plain")
            .body("OK");
}

	
	@GetMapping("/")
    public ResponseEntity<String> testing() {
    	return ResponseEntity.ok()
                .header("Content-Type", "text/plain")
                .body("OK");
    }
	
}
