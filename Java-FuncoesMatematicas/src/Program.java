/**
 * 
 */


/**
 * @author Kleilson Santos 
 *
 */

import java.util.Locale;
import java.util.Random;

public class Program {

	public static void main(String[] args) {
		/*
		 * Definindo o 'Locale.US' para os números de ponto flutuante sejam visualizados
		 * com '.' no lugar da ','
		 */
		Locale.setDefault(Locale.US);

		/* Declarando variáveis do tipo double */
		double k1 = 2.0;
		double k2 = 5.0;
		double k3 = 3.0;
		double k4 = 10.0;
		double k5 = 9.0;
		double k6 = 23.68;

		/*
		 * Esta função retorna o valor absoluto de um número, isto significa que o
		 * retorno será sempre positivo
		 */
		double s0 = Math.abs(k5);

		/* Esta função do Java, retorna o maior valor entre dois números. */
		double s1 = Math.max(k3, k4);

		/*
		 * Esta função retorna o menor valor passado como parâmetro, ou NaN se o
		 * parâmetro não é ou não pode ser convertido para um número
		 */
		double s2 = Math.min(k3, k4);

		/* Esta função retorna a raiz quadrada de um número */
		double s3 = Math.sqrt(k5);

		/*
		 * Esta função é usada para calcular a potência de um número, ou seja, calcular
		 * a base para a potência do expoente (baseexponente).
		 */
		double s4 = Math.pow(k2, k3);
		
		/*
		 * Esta função serve para representar o valor aproximadamente de PI 3,1415...
		 */
		double s5 = Math.PI;

		/*
		 * Esta função representa a base dos logarítmos naturais, aproximadamente 2.718.
		 */
		double s6 = Math.E;
		System.out.println(s6);

		/* Esta função retorna o menor número inteiro maior ou igual a "x" */
		double s7 = Math.ceil(k6);
		
		/* Esta função retorna números aleatórios "x" */
		Random random = new Random();

		System.out.println("'Math.max()' -> " + k1 + "," + k2 + "," + k4 + " -> " + s1);
		System.out.println("'Math.min()' -> " + k1 + "," + k2 + "," + k4 + " -> " + s2);
		System.out.println("'Math.sqrt()' -> " + k5 + " -> " + s3);
		System.out.println("'Math.pow()' -> " + k2 + " elevado a " + k3 + " -> " + s4);
		System.out.println("'Math.PI' -> " + s5);
		System.out.println("'Math.E' -> " + s6);
		System.out.println("'Math.ceil()' -> " + k6 + " -> " + s7);
		System.out.println("'Math.abs' de -> " + k5 + " -> " + s0);
		System.out.println("'Math.random' de  0 a 10 -> " + random.nextInt(10));

	}

}
