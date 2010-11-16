package com.tdd.jcajero;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


import org.junit.Test;


public class RequestBalanceOperationTest {
	
	@Test
	public void successRequestBalanceOperationTest(){
		Account account = mock(Account.class);
		when(account.balance()).thenReturn(new Amount(2000));
		Operation operation = new RequestBalanceOperation(account);
		Amount currentBalance = operation.execute();
		assertEquals(new Amount(2000), currentBalance);
	}

}
