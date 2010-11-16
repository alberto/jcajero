package com.tdd.jcajero;

public class RequestBalanceOperation implements Operation {

	private Account account;
	
	public RequestBalanceOperation(Account account) {
		this.account = account;
	}

	@Override
	public Amount execute() {
		return account.balance();
	}

}
