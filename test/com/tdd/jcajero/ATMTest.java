package com.tdd.jcajero;

import org.junit.Test;
import static org.junit.Assert.*;

public class ATMTest {
	
	@Test
	public void getCardTest(){
		PIN pin = new PIN(new Digit(1), new Digit(1), new Digit(1), new Digit(1));
		Card card = new Card(pin);
		
		ATM atm = new ATM(card);
		assertTrue(atm.acceptCard());
	}

}
