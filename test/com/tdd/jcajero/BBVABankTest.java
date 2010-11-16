package com.tdd.jcajero;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class BBVABankTest {

	BankConnector connector;
	BBVABank bank;

	@Before
	public void setUp() {
		connector = mock(BankConnector.class);
		bank = new BBVABank(connector);
	}

	@Test
	public void buildBankWithConnector() throws Exception {
		assertNotNull(bank);
	}

	@Test
	public void accessControlWithCardAndPinCorrect() throws Exception {
		String token = "1234556";
		Card card = mock(Card.class);
		PIN pin = mock(PIN.class);

		when(connector.accessAcount(card, pin)).thenReturn(token);
		Account account = bank.accessAcount(card, pin);

		assertNotNull(account);
		assertEquals(token, account.token);
	}

	@Test(expected = InvalidPinException.class)
	public void accessControlWithCardAndPinIncorrect() throws Exception {
		Card card = mock(Card.class);
		PIN pin = mock(PIN.class);

		when(connector.accessAcount(card, pin)).thenThrow(
				new InvalidPinException());

		bank.accessAcount(card, pin);
	}

	@Test
	public void testAccountBalance() {
		String token = "any";
		Amount amount = new Amount(5);

		when(connector.accountBalance(token)).thenReturn(amount);

		Amount receivedAmount = bank.accountBalance(token);
		verify(connector).accountBalance(token);

		assertEquals(receivedAmount, amount);
	}

	@Test
	public void testWithdraw() throws Exception {
		Amount amount = new Amount(20);
		String token = "token";
		bank.withdraw(token, amount);
		verify(connector).withdraw(token, amount);
	}

}
