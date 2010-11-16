package com.tdd.jcajero;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PinTest {

	@Test
	public void createPin() throws Exception {
		Digit digit1 = new Digit(1);
		Digit digit2 = new Digit(2);
		Digit digit3 = new Digit(3);
		Digit digit4 = new Digit(4);
		PIN pin = new PIN(digit1, digit2, digit3, digit4);
		assertNotNull(pin);
	}
}
