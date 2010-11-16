package com.tdd.jcajero;

public class ATM {

	private Amount currentATMAmount;
	private final Bank bank;

	public ATM(Bank bank, Amount initialATMAmount) {
		this.bank = bank;
		this.currentATMAmount = initialATMAmount;
	}

	public Amount atmAvailableAmount() {
		return currentATMAmount;
	}

	public Account accessAccount(Card card, PIN pin) {
		return bank.accessAcount(card, pin);
	}

	public boolean hasEnoughAmountToWithdraw(Amount amount) {
		return amount.isLowerThan(currentATMAmount);
	}

	public void decreaseATMAmountBy(Amount amount) {
		int newValue = currentATMAmount.storedAmount() - amount.storedAmount();
		currentATMAmount = new Amount(newValue);
	}
}
