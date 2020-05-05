package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.service.ITestService;

@RestController
@RequestMapping("/onetomany")
public class TestController {

	@Autowired
	private ITestService testService;

	@GetMapping("/save")
	public ResponseEntity<?> save() {
		testService.save();
		return ResponseEntity.status(HttpStatus.OK).body("Records inserted");
	}

}
