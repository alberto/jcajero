package com.tdd.jcajero;

public class ATM {

	private final Amount initialATMAmount;
	private final Bank bank;

	public ATM(Bank bank, Amount initialATMAmount) {
		this.bank = bank;
		this.initialATMAmount = initialATMAmount;
	}

	public Amount atmAvailableAmount() {
		return initialATMAmount;
	}

	public Account accessAccount(Card card, PIN pin) {
		return bank.accessAcount(card, pin);
	}

}
