package com.tdd.jcajero;

import static org.junit.Assert.assertNotNull;
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
}
