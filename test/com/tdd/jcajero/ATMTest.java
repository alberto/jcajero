package com.tdd.jcajero;

import org.junit.Test;
import static org.junit.Assert.*;

public class ATMTest {
	
	@Test
	public void acceptCardTest(){
		Card card = new Card("Alicia");
		
		ATM atm = new ATM(card);
		assertTrue(atm.acceptCard());
	}

}
