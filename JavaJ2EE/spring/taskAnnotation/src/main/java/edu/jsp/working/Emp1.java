package edu.jsp.working;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("emp1")
public class Emp1 implements Employees{

	@Override
	public void designation() {
		System.out.println("Im working as a Developer");
		
	}

	@Override
	public void salary() {
		System.out.println("About my salary 5LPA");
		
	}

}
