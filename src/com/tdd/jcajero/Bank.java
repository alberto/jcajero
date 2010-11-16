package com.tdd.jcajero;

public interface Bank {

	Account accessAcount(Card card, PIN pin);

	public Amount accountBalance(String token);
}
