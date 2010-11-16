package com.tdd.jcajero;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AccountTest {
    @Test
    public void itShouldAskTheBankForTheAccountBalance() {
		Amount accountBalance = new Amount(2000);
		String token = "1234567890";
		Bank bank =  mock(Bank.class);
		when(bank.accountBalance(token)).thenReturn(accountBalance);

		Account userAccount = new Account(bank,token);
		Amount receivedAmount = userAccount.balance();

		verify(bank).accountBalance(token);
		assertEquals(accountBalance, receivedAmount);
	}
}