/**
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
		/*
		 * Definindo o 'Locale.US' para os números de ponto flutuante sejam visualizados
		 * com '.' no lugar da ','
		 */
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		/* Declarando variáveis e atribuindo valores
		 * a elas com a função 'scanner()'. */
		System.out.print("Nome:");
		String nome = scanner.nextLine();
		System.out.print("Email:");
		String email = scanner.nextLine();
		System.out.print("Idade:");
		int idade = scanner.nextInt();
		System.out.print("Genero:(M/F)");
		char genero = scanner.next().charAt(0);
		
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("Idade: " + idade);
		System.out.println("Genero: " + genero);
		
		/* Fechando o 'scanner'.*/
		scanner.close();
	}

}
