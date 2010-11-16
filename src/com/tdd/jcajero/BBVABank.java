package com.tdd.jcajero;

public class BBVABank implements Bank {

	private BankConnector connector;

	public BBVABank(BankConnector connector) {
		this.connector = connector;
	}

	public Account accessAcount(Card card, PIN pin) {
		String token = connector.accessAcount(card, pin);
		return new Account(this, token);
	}

	public Amount accountBalance(String token) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public void withdraw(String token, Amount ammount) {
		throw new UnsupportedOperationException("Not supported yet.");

	}

}
