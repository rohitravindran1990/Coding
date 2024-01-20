package com.studio.app.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class AppController {
	
	@GetMapping("/response")
	public String response() {
		return "ok response";
		
	}

}
