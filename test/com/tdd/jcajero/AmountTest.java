/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tdd.jcajero;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alberto
 */
public class AmountTest {

    public AmountTest() {
    }

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

	@Test
	public void returnTheStoredAmount() {
		Amount amount = new Amount(5);
		int storedAmount = amount.storedAmount();

		assertEquals(5, storedAmount);
	}

	@Test
	public void twoAmountsAreEqualWhenTheyRepresentTheSameAmount() {
		Amount five = new Amount(5);
		Amount fiveAgain = new Amount(5);
		assertEquals(five, fiveAgain);
	}
	
	@Test
	public void twoAmountsAreDifferentWhenTheyRepresentDifferentAmounts() {
		Amount five = new Amount(5);
		Amount six = new Amount(6);
		assertFalse(five == six);
	}

	@Test
	public void amountsCanBeNegative() {
		Amount minusFive = new Amount(-5);
		assertEquals(-5, minusFive.storedAmount());
	}

	@Test
	public void canCompareIfAnAmountIsLowerThanOther() {
		Amount amount = new Amount(5);
		Amount smallerAmount = new Amount(1);
		assertTrue(smallerAmount.isLowerThan(amount));
	}

	@Test
	public void canCompareIfAnAmountIsHigherThanOther() {
		Amount amount = new Amount(5);
		Amount higherAmount = new Amount(10);
		assertFalse(higherAmount.isLowerThan(amount));
	}

}