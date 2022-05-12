/**
 * 
 */
package br.com.java.application;

/**
 * @author Kleilson Santos 
 *
 */

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		/* Declarando variáveis do tipo 'int' */
		int valorA = 5;
		int valorB = 5;
		
		/* Declarando variável para receber o valor da soma 
		 * das variáveis 'valorA' + 'valorB'.*/
		int resultadoSoma = valorA + valorB;
		
		/* Imprimindo o valor da variável 'resultadoSoma'.*/
		System.out.println(resultadoSoma);
		
	}

}
