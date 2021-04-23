package com.test.postgresql.springbootpostgresql.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.postgresql.springbootpostgresql.controller.model.User;

public class PrivateEndpoint {

	
	 @GetMapping("userdetails")
	    public ResponseEntity<User> getUserInfo(@AuthenticationPrincipal User user) {
	        return ResponseEntity.ok(user);
	    }
}
