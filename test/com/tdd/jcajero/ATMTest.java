package com.tdd.jcajero;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class ATMTest {

	private Bank bank;
	private Amount initialATMAmount;
	private ATM atm;

	@Before
	public void initATM() {
		bank = mock(Bank.class);
		initialATMAmount = new Amount(1000);
		atm = new ATM(bank, initialATMAmount);
	}

	@Test
	public void canRequestAvailableAmount() {
		assertEquals(initialATMAmount, atm.atmAvailableAmount());
	}

	@Test
	public void authenticateCardWithCorrectPin() {
		Card card = mock(Card.class);
		PIN pin = mock(PIN.class);
		Account expectedAccount = mock(Account.class);
		when(bank.accessAcount(card, pin)).thenReturn(expectedAccount);

		assertEquals(atm.accessAccount(card, pin), expectedAccount);
	}

	@Test(expected = InvalidPinException.class)
	public void authenticateCardWithIncorrectPin() throws Exception {
		Card card = mock(Card.class);
		PIN pin = mock(PIN.class);

		when(bank.accessAcount(card, pin)).thenThrow(new InvalidPinException());

		atm.accessAccount(card, pin);
	}

}
