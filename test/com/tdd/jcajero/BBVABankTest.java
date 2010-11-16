
package com.tdd.jcajero;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BBVABankTest {

	@Test
	public void testAccountBalance() {
		BankConnector connector = mock(BankConnector.class);
		BBVABank bank = new BBVABank(connector);
		String token = "any";
		Amount amount = new Amount(5);

		when(connector.accountBalance(token)).thenReturn(amount);

		Amount receivedAmount = bank.accountBalance(token);
		verify(connector).accountBalance(token);
		
		assertEquals(receivedAmount, amount);
	}

}