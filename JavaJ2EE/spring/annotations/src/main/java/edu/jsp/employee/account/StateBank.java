package edu.jsp.employee.account;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sbi")
public class StateBank implements Account{

	@Override
	public void deposit() {
		System.out.println("The Amount Credited to State Bank Account");
		
	}

	@Override
	public void withdraw() {
		System.out.println("The Amount Debited from State Bank Account");
		
	}

}
