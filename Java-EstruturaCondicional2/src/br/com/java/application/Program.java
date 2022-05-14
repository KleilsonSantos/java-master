/*
 *Uma operadora de telefonia cobra R$ 30.00 por um plano básico que
 *dá direito a 100 minutos de telefone. Cada minuto que exceder a
 *franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
 *quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
 *a ser pago.
 * 
 */
package br.com.java.application;

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

		scanner.close();
	}
}