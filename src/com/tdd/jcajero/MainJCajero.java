package com.tdd.jcajero;

import java.io.IOException;

public class MainJCajero {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		
		Bank bankBBVA = new BBVABank();
		
		System.out.println("******** BIENVENIDO AL CAJERO BBVA DEL INFIERNO");
		System.out.println("Introduzca la tarjeta (Nombre de usuario): " );
		int user = 0;
		while (user!=13) {
			user = System.in.read();
			System.out.print((char)user);
		}
		System.out.println("Introduzca el PIN");
		int pin = 0;
		while (pin!=13) {
			pin = System.in.read();
			System.out.print((char)pin);
		}
	}

}
