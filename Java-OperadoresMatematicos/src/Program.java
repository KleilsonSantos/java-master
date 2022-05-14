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
		Locale.setDefault(Locale.US);
		
		/* Declarando variáveis do tipo 'int' */
		int valorA = 5;
		int valorB = 5;
		
		/* Declarando variável para receber o valor da soma 
		 * das variáveis 'valorA' + 'valorB'.*/
		int resultadoSoma = valorA + valorB;
		
		/* Declarando variável para receber o valor da soma 
		 * das variáveis 'valorA' + 'valorB'.*/
		int resultadoSubtracao = valorA - valorB;
		
		/* Declarando variável para receber o valor da soma 
		 * das variáveis 'valorA' + 'valorB'.*/
		int resultadoMultiplicacao = valorA * valorB;
		
		/* Declarando variável para receber o valor da soma 
		 * das variáveis 'valorA' + 'valorB'.*/
		int resultadoDivisao = valorA / valorB;
		
		/* Declarando variável para receber o valor da soma 
		 * das variáveis 'valorA' + 'valorB'.*/
		int resultadoModulo = valorA % valorB;
		
		/* Imprimindo o valor da variável 'resultadoSoma'.*/
		System.out.println("Resuldate da soma de " + valorA + " + " + valorB + " -> " + resultadoSoma);
		System.out.println("Resuldate da subtração de " + valorA + " - " + valorB + " -> " + resultadoSubtracao);
		System.out.println("Resuldate da Multitplicação de " + valorA + " * " + valorB + " -> " + resultadoMultiplicacao);
		System.out.println("Resuldate da divisão de " + valorA + " / " + valorB + " -> " + resultadoDivisao);
		System.out.println("Resuldate do módulo de " + valorA + " % " + valorB + " -> " + resultadoModulo);
		
	}

}
