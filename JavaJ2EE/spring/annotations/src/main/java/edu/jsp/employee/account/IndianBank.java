package edu.jsp.employee.account;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ib")
public class IndianBank implements Account{

	@Override
	public void deposit() {
		System.out.println("The Amount Credited to Indian Bank Account");
		
	}

	@Override
	public void withdraw() {
		System.out.println("The Amount Debited from Indian Bank Account");
		
	}
}
