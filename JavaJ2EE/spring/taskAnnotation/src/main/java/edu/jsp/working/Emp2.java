package edu.jsp.working;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("emp2")
public class Emp2 implements Employees{

	@Override
	public void designation() {
		System.out.println("Im working as a Test Engineer");
		
	}

	@Override
	public void salary() {
		System.out.println("About my salary 3.5LPA");
		
	}

}

