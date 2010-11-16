package com.tdd.jcajero;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.Test;


public class WithdrawMoneyOperationTest {
	
	@Test
	public void successWithdrawOperationTest(){
		ATM atm = mock(ATM.class);
		Account account = mock(Account.class);
		Amount amountToWithDraw = new Amount(80);
		Operation operation = new WithdrawMoneyOperation(atm, account, amountToWithDraw);
		Amount currentBalance = operation.execute();
		assertEquals(1020, currentBalance);
	}

}
