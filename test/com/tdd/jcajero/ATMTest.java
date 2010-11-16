package com.tdd.jcajero;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

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
		Card card = new Card("Alicia");
		Digit digit1 = new Digit(1);
		Digit digit2 = new Digit(1);
		Digit digit3 = new Digit(1);
		Digit digit4 = new Digit(1);
		PIN pin = new PIN(digit1, digit2, digit3, digit4);

		Account account = atm.accessAccount(card, pin);

		verify(bank).accessAcount(card, pin);
	}

}
