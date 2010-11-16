package com.tdd.jcajero;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import org.junit.Test;

public class BankConnectorTest {

	@Test
	public void createConnectorWithUrl() throws Exception {
		BankURL url = mock(BankURL.class);
		assertNotNull(new BankConnector(url));
	}

}
