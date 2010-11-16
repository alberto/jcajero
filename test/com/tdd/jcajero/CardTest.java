package com.tdd.jcajero;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CardTest {

	@Test
	public void createCard() throws Exception {
		
		String user = new String("Alicia");
		
		Card card = new Card(user);
		assertTrue(card.user().equals(user ));
	}
	
	

}
