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
		String dia;

		switch (valor) {
		case 1: 
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "domingo";
			break;
		case 7:
			dia = "sexta";
			break;
		default:
			dia = "inválido!";
			break;
		}

		System.out.println("Dia da semana: " + dia);
		
		// fechando o scanner.
		scanner.close();
	}
}