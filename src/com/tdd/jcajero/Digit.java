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

	@Override
	public boolean equals(Object other) {
		if (other instanceof Digit) {
			Digit otherDigit = (Digit) other;
			return value == otherDigit.value;
		}
		return false;
	}

	public static Digit digitFromString(String string, int position) {
		Digit digit = null;
		
		char[] stringChars = string.toCharArray();
		char positionChar = stringChars[position-1];
		String positionString = "" + positionChar;
		digit = new Digit(Integer.parseInt(positionString));
		
		return digit;
	}

}
