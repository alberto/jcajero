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
			Operation operation;

			if (account != null) {

				int operationIndex = -1;
				do {

					System.out.println("1.- Retirar dinero");
					System.out.println("2.- Consultar saldo");
					System.out.println("0.- Salir");

					String operationString = reader.readLine();
					Amount currentBalance = null;
					try {
						operationIndex = Integer.parseInt(operationString);
						
						switch (operationIndex) {
						case 1:
							System.out.println("Cantidad a retirar: ");
							String amountToWithdraw = reader.readLine();
							operation = new WithdrawMoneyOperation(atm, account, new Amount(Integer.parseInt(amountToWithdraw)));
							currentBalance = operation.execute();
							System.out.println("El saldo resultante es: "+ currentBalance);
							break;
							
						case 2:
							operation = new RequestBalanceOperation(account);
							currentBalance = operation.execute();
							System.out.println("Tu saldo actual es: "+ currentBalance);
							break;

						default:
							break;
						}
						
					} catch (NumberFormatException e) {
						System.out.println("No seas listo y mete un nœmero ;)");
					}

				} while (operationIndex != 0);
			}
			System.out.println("Gracias por usar nuestro banco.");

		} catch (IllegalArgumentException e) {
			System.out.println("Pin no valido");
		}
	}

}
