package com.sagitta.servicetemplate.greeting.domain;

import java.io.Serializable;


public record CreateGreetingDto(String language, String message) implements Serializable {
	
}