package com.lawrence.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallBackController {
	
	@GetMapping("/userFallBack")
	public String userFallBackMethod() {
		return "The user Service is taking longer to respond." +
				"please try again later";
	}
	
	@GetMapping("/departmentFallBack")
	public String departmentFallBackMethod() {
		return "The department Service is taking longer to respond." +
				"please try again later";
	}

}
