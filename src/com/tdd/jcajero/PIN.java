package com.tdd.jcajero;

public class PIN {

	private Digit first;
	private Digit second;
	private Digit third;
	private Digit fourth;

	public PIN(final Digit digit1, final Digit digit2, final Digit digit3,
			final Digit digit4) {
		first = digit1;
		second = digit2;
		third = digit3;
		fourth = digit4;
		if (firstDigitIsNull() || secondDigitIsNull() || thirdDigitIsNull()
				|| fourthDigitIsNull()) {
			throw new IllegalArgumentException("a digit is null");
		}

	}

	private boolean firstDigitIsNull() {
		return first == null;
	}

	private boolean secondDigitIsNull() {
		return second == null;
	}

	private boolean thirdDigitIsNull() {
		return third == null;
	}

	private boolean fourthDigitIsNull() {
		return fourth == null;
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof PIN) {
			PIN otherPin = (PIN) other;
			return thisPinHasTheSameFirstDigitAs(otherPin)
					&& thisPinHasTheSameSecondDigitAs(otherPin)
					&& thisPinHasTheSameThirdDigitAs(otherPin)
					&& thisPinHasTheSameFourthDigitAs(otherPin);
		}
		return false;
	}

	private boolean thisPinHasTheSameFirstDigitAs(PIN otherPin) {
		return first.equals(otherPin.first);
	}

	private boolean thisPinHasTheSameSecondDigitAs(PIN otherPin) {
		return second.equals(otherPin.second);
	}

	private boolean thisPinHasTheSameThirdDigitAs(PIN otherPin) {
		return third.equals(otherPin.third);
	}

	private boolean thisPinHasTheSameFourthDigitAs(PIN otherPin) {
		return fourth.equals(otherPin.fourth);
	}
}
