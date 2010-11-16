package com.tdd.jcajero;

public class BBVABank implements Bank {
	private final BankConnector connector;

	public BBVABank(BankConnector connector) {
		this.connector = connector;
	}

	public Account accessAcount(Card card, PIN pin) {
		return new Account(this, "");
	}

	@Override
	public Amount accountBalance(String token) {
		return connector.accountBalance(token);
	}

}
