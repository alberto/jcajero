package com.tdd.jcajero;

public class Account {
	private final Bank bank;
	private final String token;

	Account(Bank bank, String token) {
		this.bank = bank;
		this.token = token;
		
	}

	Amount balance() {
		return bank.accountBalance(token);
	}

}
