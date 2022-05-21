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
		int age = 30;
		int code = 5290;
		
		/* Declarando variável do tipo 'double' */
		double resultDouble = age + code;
		System.out.println(resultDouble);
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		char sexo = 'M';
		int salario = 2000;
		String genero = String.valueOf(sexo);
		String stringSalario = String.valueOf(salario);
		System.out.println(genero);
		System.out.println(stringSalario);
		
		
		/* Declarando variável do tipo 'int' e aplicando o casting*/
		int resultInt = (int) (price1 + price2 + measure); 
		System.out.println(resultInt);
		
	}

}
