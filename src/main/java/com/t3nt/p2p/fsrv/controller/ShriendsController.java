package com.t3nt.p2p.fsrv.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shriends")
public class ShriendsController {

	@PostMapping("/signup")
	public ResponseEntity<String> postSignUpData() {
		String responseBody = "";
		Integer status = 0;
		ResponseEntity<String> response = ResponseEntity.status(status).body(responseBody);
		return response;
	}
	
}
