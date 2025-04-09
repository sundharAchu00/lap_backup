package edu.jsp.product.interfac;

import org.springframework.stereotype.Component;

@Component
public class Elephant implements Animals{

	@Override
	public void sound() {
		System.out.println("trumpet");
		
	}

}
