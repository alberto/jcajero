package com.tdd.jcajero;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ATMTest {
	private Card card;
	private Amount initialATMAmount;
	private ATM atm;
	
	@Before
	public void initATM() {
		card = new Card("Alicia");
		initialATMAmount = new Amount(1000);
		atm = new ATM(card, initialATMAmount);
	}

	@Test
	public void acceptCardTest(){
		assertTrue(atm.acceptCard());
	}

	@Test
	public void canRequestAvailableAmount() {
		assertEquals(initialATMAmount, atm.atmAvailableAmount());
	}
}
