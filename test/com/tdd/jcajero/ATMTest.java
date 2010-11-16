package com.tdd.jcajero;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ATMTest {

	@Test
	public void acceptCardTest() {
		Card card = new Card("Alicia");

		ATM atm = new ATM(card);
		assertTrue(atm.acceptCard());
	}

	@Test
	public void authenticateCardWithCorrectPin() {
		Card card = new Card("Alicia");
		Digit digit1 = new Digit(1);
		Digit digit2 = new Digit(1);
		Digit digit3 = new Digit(1);
		Digit digit4 = new Digit(1);
		PIN pin = new PIN(digit1, digit2, digit3, digit4);
		ATM atm = new ATM(card);

		atm.authenticateCardWithPin(pin);

	}

}
