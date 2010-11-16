package com.tdd.jcajero;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class BBVABankTest {
	BankConnector connector;

	@Before
	public void setUp() {
		connector = mock(BankConnector.class);
	}

	@Test
	public void buildBankWithConnector() throws Exception {
		Bank bank = new BBVABank(connector);
		assertNotNull(bank);
	}

	@Test
	public void accessControlWithCardAndPinCorrect() throws Exception {
		String token = "1234556";
		Card card = mock(Card.class);
		PIN pin = mock(PIN.class);
		Bank bank = new BBVABank(connector);

		when(connector.accessAcount(card, pin)).thenReturn(token);
		Account account = bank.accessAcount(card, pin);

		assertNotNull(account);
		assertEquals(token, account.token);
	}

	@Test(expected = InvalidPinException.class)
	public void accessControlWithCardAndPinIncorrect() throws Exception {
		Card card = mock(Card.class);
		PIN pin = mock(PIN.class);
		Bank bank = new BBVABank(connector);

		when(connector.accessAcount(card, pin)).thenThrow(
				new InvalidPinException());

		bank.accessAcount(card, pin);
	}
}
