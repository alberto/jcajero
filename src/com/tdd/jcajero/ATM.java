package com.tdd.jcajero;

public class ATM {
	
	private Card card;
	private final Amount initialATMAmount;
	
	public ATM(Card card, Amount initialATMAmount) {
		this.card = card;
		this.initialATMAmount = initialATMAmount;
	}

	public boolean acceptCard(){
		return true;
	}

	public Amount availableAmount() {
		return initialATMAmount;
	}

}
