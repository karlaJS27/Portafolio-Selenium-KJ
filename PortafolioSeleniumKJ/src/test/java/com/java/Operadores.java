package com.java;

public class Operadores {

	public static void main(String[] args) {
		// operadores aritmeticos

		int x = 2;
		int y = 2;

		int suma = x + y;
		int resta = x - y;
		int multiplicacion = x * y;
		int div = x / y;

		double z = 2.23;
		double a = 4.34;

		double mult2 = z * a;

		System.out.println("Esta es la suma" + suma);
		System.out.println("Esta es la suma" + resta);
		System.out.println("Esta es la suma" + multiplicacion);
		System.out.println("Esta es la suma" + div);

		System.out.println("El valor double es " + mult2);

		// Operadores unarios

		int unario = 2;
		unario++;

		System.out.println(unario);

		// Operadores relacionales

//		igual que ==
//		Diferente a !=
//		Mayor que >
//		Mayor o igual que >=
//		Menor que <
//		Menor o igual que <=

		int or = 2;
		int or2 = 3;

		if (or < or2) {

			System.out.println("TRUE");
		} else {
			System.out.println("Falso");
		}

		String message = "Hello";
		String msg2 = "Hello";

		if (message == msg2) {
			System.out.println("STRING TRUE");
		} else {

			System.out.println("STRING false");
		}

		// Operadores condicionales

//		AND &&
//		OR ||

		int oper1 = 2;
		int oper2 = 2;
		int oper3 = 4;
		int oper4 = 3;

		if (oper1 == oper2 || oper3 == oper4) {
			System.out.println("Todos los valores son iguales");
		} else {
			System.out.println("Algun valor es diferente");
		}

	}

}
