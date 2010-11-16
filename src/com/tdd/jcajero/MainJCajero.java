package com.tdd.jcajero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainJCajero {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		Bank bankBBVA = new BBVABank();
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		System.out.println("******** BIENVENIDO AL CAJERO BBVA DEL INFIERNO");
		System.out.println("Introduzca la tarjeta (Nombre de usuario): ");

		String user = reader.readLine();
		System.out.println("Bienvenido: " + user);
		Card card = new Card(user);
		System.out.println("Introduzca el PIN de la tarjeta: ");
		String pinText = reader.readLine();
		System.out.println(pinText);

		try {
			PIN pin = PIN.fromString(pinText);
			
		} catch (IllegalArgumentException e) {
			System.out.println("Pin no valido");
		}

	}

}
