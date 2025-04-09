package edu.jsp.springLifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class SpringLC {
	
	@PostConstruct
	public void start() {
		System.out.println("I'm init() invoked");
	}
	
	public void m1() {
		System.out.println("I'm m1() Executed...");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("I'm destroy() invoked");
	}

}
