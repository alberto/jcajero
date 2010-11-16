package com.tdd.jcajero;

public class BBVABank implements Bank {

	private final BankConnector connector;

	public BBVABank(BankConnector connector) {
		this.connector = connector;
	}

	public Account accessAcount(Card card, PIN pin) {
		String token = connector.accessAcount(card, pin);
		return new Account(this, token);
	}

	public Amount accountBalance(String token) {
		return connector.accountBalance(token);
	}

	public void withdraw(String token, Amount amount) {
		connector.withdraw(token, amount);
	}

}
