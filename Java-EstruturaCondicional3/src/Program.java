/*
 * 
 */

/**
 * @author Kleilson Santos 
 *
 */

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		int value1 = 10;
		int value2 = 20;

		boolean maior = value2 > value1;
		boolean menor = value1 < value2;
		
		// Condição ternária
		System.out.println(!maior ? "Menor" : "Maior");
		System.out.println(menor ? "Menor" : "Maior");

	}
}