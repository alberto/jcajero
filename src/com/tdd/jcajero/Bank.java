package com.tdd.jcajero;

public interface Bank {

	public Amount accountBalance(String token);
	Account accessAcount(Card card, PIN pin);
}
