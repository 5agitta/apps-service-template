package com.sagitta.servicetemplate.greeting;

import com.sagitta.servicetemplate.logging.annotations.LoggingClass;
import com.sagitta.servicetemplate.logging.annotations.NoLogging;
import org.springframework.stereotype.Component;

@Component
@LoggingClass
public class Counter {
	
	private int count;
	
	public int count() {
		return count;
	}
	
	@NoLogging
	public void increment(int i) {
		count += i;
	}
	
}
