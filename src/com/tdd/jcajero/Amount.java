
package com.tdd.jcajero;
public class Amount {
	private final int value;

	public Amount(int value) {
		this.value = value;
	}

	public int storedAmount() {
		return value;
	}

	@Override
	public boolean equals(Object o) {
		Amount comparedAmount = (Amount) o;
		return amountsValueAreEqual(comparedAmount);
	}

	private boolean amountsValueAreEqual(Amount comparedAmount) {
		return value == comparedAmount.storedAmount();
	}

	public boolean isLowerThan(Amount amount) {
		return value < amount.storedAmount();
	}

}
