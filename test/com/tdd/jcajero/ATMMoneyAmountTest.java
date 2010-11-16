

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
public class ATMMoneyAmountTest {

    public ATMMoneyAmountTest() {
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
    public void whenAnATMMoneyAmountIsCreatedHasTheCompleteGivenAmount() {
		Amount amount = new Amount(1000);
		ATMMoneyAmount moneyAmount = new ATMMoneyAmount(amount);
		assertEquals(amount, moneyAmount.availableAmount());
	}

}