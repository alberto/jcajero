package com.tdd.jcajero;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ATMTest {

	private Amount initialATMAmount;
	private ATM atm;

	@Before
	public void initATM() {
		initialATMAmount = new Amount(1000);
		atm = new ATM(initialATMAmount);
	}

	@Test
	public void acceptCardTest() {
		initialATMAmount = new Amount(1000);
		atm = new ATM(initialATMAmount);
		Card card = new Card("Alicia");
		assertTrue(atm.acceptCard(card));
	}

	@Test
	public void testNotAcceptInvalidCard() throws Exception {
		initialATMAmount = new Amount(1000);
		atm = new ATM(initialATMAmount);
		assertFalse(atm.acceptCard(null));
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
		ATM atm = new ATM(new Amount(1000));
		atm.acceptCard(card);
		atm.authenticateCardWithPin(pin);

	}

}
