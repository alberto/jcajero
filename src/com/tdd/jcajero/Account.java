package com.tdd.jcajero;

public class Account {
	private final Bank bank;
	public final String token;

	Account(Bank bank, String token) {
		this.bank = bank;
		this.token = token;

	}

	Amount balance() {
		return bank.accountBalance(token);
	}

	public void withdraw(Amount ammount) {
		bank.withdraw(token, ammount);
	}

}
