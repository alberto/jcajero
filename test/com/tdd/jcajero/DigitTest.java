package com.tdd.jcajero;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class DigitTest {

	Digit digit;

	@Test
	public void createDigit() throws Exception {
		int digitValue = 1;
		digit = new Digit(digitValue);
		assertNotNull(digit);
	}

	@Test(expected = IllegalArgumentException.class)
	public void dontCreateDigitBiggerThanNine() throws Exception {
		int digitValue = 10;
		digit = new Digit(digitValue);
		fail("Should fail!");
	}

	@Test(expected = IllegalArgumentException.class)
	public void dontCreateDigitSmallerThanZero() throws Exception {
		int digitValue = -1;
		digit = new Digit(digitValue);
		fail("Should fail!");
	}

	@Test(expected = IllegalArgumentException.class)
	public void dontCreateDigitWithLetters() throws Exception {
		digit = new Digit('a');
		fail("Should fail!");
	}

	@Test
	public void twoDigitsAreEqual() throws Exception {
		digit = new Digit(1);
		Digit otherDigit = new Digit(1);
		assertTrue(digit.equals(otherDigit));
		assertTrue(otherDigit.equals(digit));
	}

	@Test
	public void twoDigitsArentEqual() throws Exception {
		digit = new Digit(2);
		Digit otherDigit = new Digit(3);
		assertFalse(digit.equals(otherDigit));
		assertFalse(otherDigit.equals(digit));
	}

	@Test
	public void aDigitIsNotEqualToNull() throws Exception {
		digit = new Digit(1);
		assertFalse(digit.equals(null));
	}
}
