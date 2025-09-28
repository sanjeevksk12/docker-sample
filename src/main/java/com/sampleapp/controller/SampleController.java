package com.sampleapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping("/message")
      private String getMessage() {
    	  return "Welcome to Deops Training ";
      }

}
