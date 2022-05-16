/*
 * O programa lê números
 * inteiros até que um zero seja lido. Ao
 * final mostra a soma dos números lidos.
 */

/**
 * @author Kleilson Santos 
 *
 */

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int value;
		int result = 0;
		
		try {
			do {
				System.out.print("Entrada: ");
				value = scanner.nextInt();
				result += value;
			} while (value != 0);
			System.out.println("Resultado da soma dos valores \ndiferentes de zero -> " + result);
		} catch (InputMismatchException e) {
			System.err.println("Digite apenas números interiros.");
		}
		
		
		scanner.close();
	}
}


