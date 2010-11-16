package com.tdd.jcajero;

import org.junit.Test;
import static org.junit.Assert.*;

public class ATMTest {
	
	@Test
	public void acceptCardTest(){
		ATM atm = new ATM();
		Card card = new Card("Alicia");
		assertTrue(atm.acceptCard(card));
	}

}
