/**
 * 
 */


/**
 * @author Kleilson Santos 
 *
 */

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		/*
		 * Definindo o 'Locale.US' para os números de ponto flutuante sejam visualizados
		 * com '.' no lugar da ','
		 */
		Locale.setDefault(Locale.US);
		
		/*
		 * Escrevendo na tela um texto qualquer e pulando linha com o comando
		 * 'System.out.println()'
		 */
		System.out.println("Bom dia");
		
		/*
		 * Escrevendo na tela um texto qualquer sem pular linha com o comando
		 * 'System.out.print()'
		 */
		System.out.print("Bom tarde");
		
		/*
		 * Escrevendo na tela números com 2 casas décimais '%.2f' e pulando linha '%n',
		 * com o comando 'System.out.printf()'
		 */
		System.out.printf("%n%.2f%n", 501.23234);
		
		/*
		 * Concatenando strings com o comando System.out.println()
		 */
		System.out.println("Bom dia, " + "Boa Tarde");
		
		/*
		 * Concatenando vários elementos
		 */
		String nome = "Maria";
		int idade = 31;
		double renda = 503.993;
		System.out.printf("%s, tem %d anos e ganha R$ %.2f", nome, idade, renda);
	}

}