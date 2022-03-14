package com.java;

import org.apache.poi.util.SystemOutLogger;

public class DataTypes {

	public static void main(String[] args) {
		
		//datos primitivos
		byte var1 = 1;
		short var2 = 1;
		int var3 = 1;
		long var4 = 1L;
		float var5 = 1.2f;
		double var6 = 1.2;
		char var7 = 'a';
		boolean var8 = true;
		
		//declarar
		
		int x;
		x = 1000;
		
		int y = 10;
		
		char symbol = '\u00A9';
		
		String massage = "Hello";
		
		System.out.println(symbol);
		System.out.println(massage);
		
		//Concatenar
		
		System.out.println(massage + symbol);
		
		int numer = 1;
		
		String nombre = "Ricardo";
		
		System.out.println(nombre + numer);
		
		

	}

}
