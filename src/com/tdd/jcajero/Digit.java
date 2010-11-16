package com.tdd.jcajero;

public class Digit {

	private int value;

	public Digit(final int digitValue) {
		if (moreThanNine(digitValue) || lessThanZero(digitValue)) {
			throw new IllegalArgumentException();
		}
		value = digitValue;
	}

	private boolean lessThanZero(final int digitValue) {
		return digitValue < 0;
	}

	private boolean moreThanNine(final int digitValue) {
		return digitValue > 9;
	}
}
