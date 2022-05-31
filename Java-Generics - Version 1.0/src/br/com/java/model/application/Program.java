package br.com.java.model.application;

import java.util.Locale;

import br.com.java.model.entities.PrintService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);
		Integer[] vetInt = { 44, 22, 3, 1000, 1200, 4, 6 };
		PrintService ps = new PrintService();

		for (int i = 0; i < vetInt.length; i++) {
			Integer integer = vetInt[i];
			ps.addValue(integer);
		}
		ps.print();
		System.out.print("First: ");
		System.out.println(ps.first());
	}
}
