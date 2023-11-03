package com.sagitta.servicetemplate.greeting;

import com.sagitta.servicetemplate.greeting.domain.Greeting;

import java.util.Optional;

public interface GreetingService {
	
	String hello();
	
	void saveForLanguage(String language, String message);
	
	Optional<Greeting> getForLanguage(String language);
	
	String getUser();
}
