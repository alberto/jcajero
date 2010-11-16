/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tdd.jcajero;

/**
 *
 * @author alberto
 */
public class ATMMoneyAmount {
	private final Amount amount;

	ATMMoneyAmount(Amount amount) {
		this.amount = amount;
		
	}
	public Amount availableAmount() {
		return amount;
	}
}
