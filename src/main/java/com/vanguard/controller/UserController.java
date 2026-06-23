package com.vanguard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vanguard.model.User;

@RestController
@RequestMapping("/") 
public class UserController {
    @GetMapping("/api/v1/users/{userId}")
    public User getUser(@PathVariable Long userId) {
    	System.out.println("user ID = "+userId);
    	User user = new User(userId, "Arsh");
        //return new User(userId, "Arsh"); // Returns JSON directly
    	return user;
    }
    
    @GetMapping("/")
    public String testing() {
    	System.out.println("testing");
    	//return new User(userId, "Arsh"); // Returns JSON directly
    	return "testing method called perfectly";
    }
}
