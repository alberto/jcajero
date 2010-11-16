package com.tdd.jcajero;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class ATMTest {

	private Bank bank;
	private Amount initialATMAmount;
	private int valueForAmount = 1000;
	private ATM atm;

	@Before
	public void initATM() {
		bank = mock(Bank.class);
		initialATMAmount = new Amount(valueForAmount);
		atm = new ATM(bank, initialATMAmount);
	}

	@Test
	public void canRequestAvailableAmount() {
		assertEquals(initialATMAmount, atm.atmAvailableAmount());
	}

	@Test
	public void authenticateCardWithCorrectPin() {
		Card card = mock(Card.class);
		PIN pin = mock(PIN.class);
		Account expectedAccount = mock(Account.class);
		when(bank.accessAcount(card, pin)).thenReturn(expectedAccount);

		assertEquals(atm.accessAccount(card, pin), expectedAccount);
	}

	@Test(expected = InvalidPinException.class)
	public void authenticateCardWithIncorrectPin() throws Exception {
		Card card = mock(Card.class);
		PIN pin = mock(PIN.class);

		when(bank.accessAcount(card, pin)).thenThrow(new InvalidPinException());

		atm.accessAccount(card, pin);
	}

	@Test
	public void canValidateIfATMAmountIsEnoughForWithdrawal() {
		Amount amountToBeWithdrawn = new Amount(1);
		assertTrue(atm.hasEnoughAmountToWithdraw(amountToBeWithdrawn));
	}

	@Test
	public void cannotWithdrawMoneyIfAmountIsTooBig() {
		Amount amountToBeWithdrawn = new Amount(100000);
		assertFalse(atm.hasEnoughAmountToWithdraw(amountToBeWithdrawn));
	}

	@Test
	public void canDecreaseATMAmount() {
		Amount amountToBeWithdrawn = new Amount(10);
		atm.decreaseATMAmountBy(amountToBeWithdrawn);
		Amount newATMAmount = atm.atmAvailableAmount();
		assertEquals(new Amount(valueForAmount - 10), newATMAmount);

	}
}
