package com.tdd.jcajero;

public interface Bank {

	Account accessAcount(Card card, PIN pin);

	Amount accountBalance(String token);

	void withdraw(String token, Amount ammount);
}
