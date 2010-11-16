package com.tdd.jcajero;

public class WithdrawMoneyOperation implements Operation {

	private ATM atm;
	private Account account;
	private Amount amountToWithDraw;
	
	public WithdrawMoneyOperation(ATM atm, Account account, Amount amountWithDraw) {
		this.atm = atm;
		this.account = account;
		this.amountToWithDraw = amountWithDraw;
	}

	@Override
	public Amount execute() {
		return null;
	}

}
