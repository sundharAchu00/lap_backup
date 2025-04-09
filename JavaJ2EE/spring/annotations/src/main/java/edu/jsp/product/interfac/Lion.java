package edu.jsp.product.interfac;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Lion implements Animals{

	@Override
	public void sound() {
		System.out.println("The Roaring Lions Are Back..!");
	}

}
