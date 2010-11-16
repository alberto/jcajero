package com.tdd.jcajero;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CardTest {

	private Card card;

	@Before
	public void setUp() {
		Digit digit1 = new Digit(1);
		Digit digit2 = new Digit(2);
		Digit digit3 = new Digit(3);
		Digit digit4 = new Digit(4);
		PIN pin = new PIN(digit1, digit2, digit3, digit4);
		card = new Card(pin);
	}

	@Test
	public void createCard() throws Exception {
		assertNotNull(card);
	}

	@Test
	public void verifyIncorrectPin() throws Exception {
		Digit digit1 = new Digit(1);
		Digit digit2 = new Digit(3);
		Digit digit3 = new Digit(3);
		Digit digit4 = new Digit(2);
		PIN incorrectPin = new PIN(digit1, digit2, digit3, digit4);

		assertFalse(card.worksWithPIN(incorrectPin));
	}

}
