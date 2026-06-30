package com.vanguard.controller;

import java.net.InetAddress;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vanguard.model.User;

@RestController
public class UserController {
	
	  // Create the logger instance
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    /*@GetMapping("/api/v1/users/{userId}")
    public User getUser(@PathVariable Long userId) {
        System.out.println("user ID = " + userId);
        return new User(userId, "Arsh");
    }*/
	
	@GetMapping("/api/v1/users/{userId}")
	public String getUser(@PathVariable Integer userId) throws Exception {
	    String instanceId = InetAddress.getLocalHost().getHostName();
	    logger.info("instanceId= {} ", instanceId);
	    return "User ID = " + userId + " | Served by: " + instanceId;
	}


    @GetMapping("/health")
    public ResponseEntity<String> health() {
	    logger.info("health method called");
    	return ResponseEntity.ok()
            .header("Content-Type", "text/plain")
            .body("OK");
}

	
	@GetMapping("/")
    public ResponseEntity<String> testing() {
	    logger.info("testing method called");
    	return ResponseEntity.ok()
                .header("Content-Type", "text/plain")
                .body("OK");
    }
	
}
