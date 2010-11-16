package com.tdd.jcajero;

public class ATM {
	
	private Card card;
	private final Amount initialATMAmount;
	
	public ATM(Amount initialATMAmount) {
		this.card = null;
		this.initialATMAmount = initialATMAmount;
	}

	public boolean acceptCard(Card card){
		boolean accepted = false;
		
		if (card != null){
			this.card = card;
			accepted = true;
		}
		
		return accepted;
	}

	public Amount availableAmount() {
		return initialATMAmount;
	}

}
