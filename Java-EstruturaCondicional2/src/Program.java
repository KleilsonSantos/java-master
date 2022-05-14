/*
 * O programa lê um valor inteiro de 1 a 7 representando um
 * dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
 * Escrever na tela o dia da semana correspondente.
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
		Scanner scanner = new Scanner(System.in);

		System.out.print("Entrada: ");
		int valor = scanner.nextInt();

		switch (valor) {
		case 1:
			System.out.println("Dia da semana: domingo");
			break;
		case 2:
			System.out.println("Dia da semana: segunda");
			break;
		case 3:
			System.out.println("Dia da semana: terça");
			break;
		case 4:
			System.out.println("Dia da semana: quarta");
			break;
		case 5:
			System.out.println("Dia da semana: quinta");
			break;
		case 6:
			System.out.println("Dia da semana: sexta");
			break;
		case 7:
			System.out.println("Dia da semana: sabado");
			break;
		default:
			System.out.println("Dia da semana, inválido!");
			break;
		}

		// fechando o scanner.
		scanner.close();
	}
}