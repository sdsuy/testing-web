package io.spring.testingweb;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	
	public String greet() {
		return "Hello, People";
	}

}
