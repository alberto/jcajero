package com.tdd.jcajero;

public class Card {

	private PIN pin;

	public Card(final PIN pin) {
		this.pin = pin;
	}

	public boolean worksWithPIN(final PIN pin) {
		return this.pin.equals(pin);
	}

}
