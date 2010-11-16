package com.tdd.jcajero;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PinTest {

	private PIN pin;
	private Digit digit1;
	private Digit digit2;
	private Digit digit3;
	private Digit digit4;
	Digit differentDigit;

	@Before
	public void setUp() {
		digit1 = new Digit(1);
		digit2 = new Digit(2);
		digit3 = new Digit(3);
		digit4 = new Digit(4);
		differentDigit = new Digit(0);
		pin = new PIN(digit1, digit2, digit3, digit4);
	}

	@Test
	public void createPin() throws Exception {
		assertNotNull(pin);
	}

	@Test(expected = IllegalArgumentException.class)
	public void createPinWithNullFirstDigit() throws Exception {
		pin = new PIN(null, digit2, digit3, digit4);
	}

	@Test(expected = IllegalArgumentException.class)
	public void createPinWithNullSecondDigit() throws Exception {
		pin = new PIN(digit1, null, digit3, digit4);
	}

	@Test(expected = IllegalArgumentException.class)
	public void createPinWithNullThirdDigit() throws Exception {
		pin = new PIN(digit1, digit2, null, digit4);
	}

	@Test(expected = IllegalArgumentException.class)
	public void createPinWithNullFourthDigit() throws Exception {
		pin = new PIN(digit1, digit2, digit3, null);
	}

	@Test
	public void twoPinsAreEqual() throws Exception {
		Digit otherDigit1 = new Digit(1);
		Digit otherDigit2 = new Digit(2);
		Digit otherDigit3 = new Digit(3);
		Digit otherDigit4 = new Digit(4);
		PIN otherPin = new PIN(otherDigit1, otherDigit2, otherDigit3,
				otherDigit4);
		assertTrue(otherPin.equals(pin));
		assertTrue(pin.equals(otherPin));
	}

	@Test
	public void twoPinsWithDifferentFirstDigitArentEqual() throws Exception {
		PIN otherPin = new PIN(differentDigit, digit2, digit3, digit4);
		assertFalse(otherPin.equals(pin));
		assertFalse(pin.equals(otherPin));
	}

	@Test
	public void twoPinsWithDifferentSecondDigitArentEqual() throws Exception {
		PIN otherPin = new PIN(digit1, differentDigit, digit3, digit4);
		assertFalse(otherPin.equals(pin));
		assertFalse(pin.equals(otherPin));
	}

	@Test
	public void twoPinsWithDifferentThirdDigitArentEqual() throws Exception {
		PIN otherPin = new PIN(digit1, digit2, differentDigit, digit4);
		assertFalse(otherPin.equals(pin));
		assertFalse(pin.equals(otherPin));
	}

	@Test
	public void twoPinsWithDifferentFourthDigitArentEqual() throws Exception {
		PIN otherPin = new PIN(digit1, digit2, digit3, differentDigit);
		assertFalse(otherPin.equals(pin));
		assertFalse(pin.equals(otherPin));
	}

	@Test
	public void nullIsDifferentFromAPin() throws Exception {
		assertFalse(pin.equals(null));
	}
}
