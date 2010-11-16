package com.tdd.jcajero;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	String token;
	Bank bank;
	Account userAccount;

	@Before
	public void setUp() {
		token = "1234567890";
		bank = mock(Bank.class);
		userAccount = new Account(bank, token);

	}

	@Test
	public void itShouldAskTheBankForTheAccountBalance() {
		Amount accountBalance = new Amount(2000);

		when(bank.accountBalance(token)).thenReturn(accountBalance);

		Amount receivedAmount = userAccount.balance();

		verify(bank).accountBalance(token);
		assertEquals(accountBalance, receivedAmount);
	}

	@Test
	public void itShouldAskTheBankForTheRequestedAmmount() throws Exception {
		Amount ammount = new Amount(1000);

		userAccount.withdraw(ammount);

		verify(bank).withdraw(token, ammount);
	}

	@Test(expected = BankException.class)
	public void itShouldRaiseExceptionWhenSomethigWrong() throws Exception {
		Amount ammount = new Amount(10000);

		doThrow(new BankException()).when(bank).withdraw(token, ammount);

		userAccount.withdraw(ammount);

	}
}