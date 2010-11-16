package com.tdd.jcajero;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {

    public AccountTest() {
    }

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void canConsultTheAccountBalance() {
		Amount accountBalance = new Amount(2000);
		Account userAccount = new Account();
		Amount receivedAmount = userAccount.balance();
		assertEquals(accountBalance, receivedAmount);
	}

//    @Test
//    public void itShouldAskTheBankForTheAccountBalance() {
//		Amount accountBalance = new Amount(2000);
//		Bank bank = new MockedBank(accountBalance);
//		Account userAccount = new Account(bank);
//		Amount receivedAmount = userAccount.balance();
//		assertTrue(bank.balaceWasCalled());
//		assertEquals(accountBalance, receivedAmount);
//	}
}