package com.tdd.jcajero;

public class BBVABank implements Bank {

	public BBVABank(BankConnector connector) {
		// TODO Auto-generated constructor stub
	}

	public Account accessAcount(Card card, PIN pin) {
		return new Account(this, "");
	}

	@Override
	public Amount accountBalance(String token) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
