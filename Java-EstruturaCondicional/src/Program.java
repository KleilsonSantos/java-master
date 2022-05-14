/*
 *Uma operadora de telefonia cobra R$ 30.00 por um plano básico que
 *dá direito a 100 minutos de telefone. Cada minuto que exceder a
 *franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
 *quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
 *a ser pago.
 * 
 */


import java.util.InputMismatchException;

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
		try {
			double planoBasico = 50.00;
			double taxaPorMinuto = 2.00;
			int planoBasicoMinutos = 100;

			System.out.print("Entre com a quantidade de minutos: ");
			int minutes = scanner.nextInt();

			if (minutes <= planoBasicoMinutos) {
				System.out.println("Valor a pagar: R$ " + String.format("%.2f", planoBasico));
			} else {
				int surplusMinutes = minutes - planoBasicoMinutos;
				double result = (double) (surplusMinutes * taxaPorMinuto);
				System.out.println("Valor do plano básico		-> R$ " + String.format("%.2f", planoBasico));
				System.out.println("Valor de minutos excedentes	-> R$ "
						+ String.format("%.2f", (surplusMinutes * taxaPorMinuto)));
				System.out.println("=================================");
				System.out.println("| Valor total a pagar: R$ " + String.format("%.2f", (result + planoBasico)) + " |");
				System.out.println("=================================");
			}

		} catch (InputMismatchException e) {
			System.out.println("Por favor digite apenas números.");
		}

		scanner.close();
	}
}