package com.tdd.jcajero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainJCajero {

	private static final int INITIAL_AMOUNT = 10000;

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		BankURL url = new BankURL();
		BankConnector connector = new BankConnector(url);
		Bank bankBBVA = new BBVABank(connector);

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		System.out.println("******** BIENVENIDO AL CAJERO BBVA DEL INFIERNO");
		System.out.println("Introduzca la tarjeta (Nombre de usuario): ");

		String user = reader.readLine();
		System.out.println("Bienvenido: " + user);
		Card card = new Card(user);
		System.out.println("Introduzca el PIN de la tarjeta: ");
		String pinText = reader.readLine();

		try {
			PIN pin = PIN.fromString(pinText);
			ATM atm = new ATM(bankBBVA, new Amount(INITIAL_AMOUNT));
			Account account = atm.accessAccount(card, pin);

			if (account != null) {

				int operation = 0;
				do {

					System.out.println("1.- Retirar dinero");
					System.out.println("2.- Consultar saldo");

					String operationString = reader.readLine();
					try {
						operation = Integer.parseInt(operationString);
						
						switch (operation) {
						case 1:
							
							break;
							
						case 2:
							
							break;

						default:
							break;
						}
						
					} catch (NumberFormatException e) {
						System.out.println("No seas listo y mete un nœmero ;)");
					}

				} while (operation != -1);
			}
			System.out.println("Gracias por usar nuestro banco.");

		} catch (IllegalArgumentException e) {
			System.out.println("Pin no valido");
		}
	}

}
