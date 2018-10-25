package com.t3nt.p2p.fsrv.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shriends")
public class ShriendsController {

	@PostMapping("/signUp")
	public ResponseEntity<String> postSignUpData(@RequestParam Map<String, String> requestParams) {
		System.out.println(new Date() + ": " + requestParams);
		String responseBody = "signup_success";
		//Integer status = HttpStatus.OK.value();
		//Integer status = HttpStatus.INTERNAL_SERVER_ERROR.value();
		Integer status = HttpStatus.OK.value();
		ResponseEntity<String> response = ResponseEntity.status(status).body(responseBody);
		return response;
	}
	
	@PutMapping("/login")
	public ResponseEntity<String> putLoginDetails(@RequestParam Map<String, String> requestParams) {
		System.out.println(new Date() + ": " + requestParams);
		String responseBody = "signup_success";
		//Integer status = HttpStatus.OK.value();
		//Integer status = HttpStatus.INTERNAL_SERVER_ERROR.value();
		Integer status = HttpStatus.OK.value();
		ResponseEntity<String> response = ResponseEntity.status(status).body(responseBody);
		return response;
	}
	
	@GetMapping("/check/username")
	public ResponseEntity<String> getUserName(@RequestParam Map<String, String> requestParams) {
		System.out.println(new Date() + ": " + requestParams);
		String responseBody = "signup_success";
		//Integer status = HttpStatus.OK.value();
		//Integer status = HttpStatus.INTERNAL_SERVER_ERROR.value();
		Integer status = HttpStatus.OK.value();
		ResponseEntity<String> response = ResponseEntity.status(status).body(responseBody);
		return response;
	}
	
	@PostMapping("/contactUs")
	public ResponseEntity<String> postContactData(@RequestParam Map<String, String> requestParams) {
		System.out.println(new Date() + ": " + requestParams);
		String responseBody = "signup_success";
		//Integer status = HttpStatus.OK.value();
		//Integer status = HttpStatus.INTERNAL_SERVER_ERROR.value();
		Integer status = HttpStatus.OK.value();
		ResponseEntity<String> response = ResponseEntity.status(status).body(responseBody);
		return response;
	}
	
}
