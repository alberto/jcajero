package com.tdd.jcajero;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ATMTest {
	private Amount initialATMAmount;
	private ATM atm;
	
	@Before
	public void initATM() {
		initialATMAmount = new Amount(1000);
		atm = new ATM(initialATMAmount);
	}

	@Test
	public void acceptCardTest(){
		initialATMAmount = new Amount(1000);
		atm = new ATM(initialATMAmount);
		Card card = new Card("Alicia");
		assertTrue(atm.acceptCard(card));
	}

	@Test
	public void testNotAcceptInvalidCard() throws Exception {
		initialATMAmount = new Amount(1000);
		atm = new ATM(initialATMAmount);
		assertFalse(atm.acceptCard(null));
	}

	@Test
	public void canRequestAvailableAmount() {
		assertEquals(initialATMAmount, atm.availableAmount());
	}

}
