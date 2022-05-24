package br.com.java.section18.model.entities;

import br.com.java.section18.model.services.Print;
import br.com.java.section18.model.services.Scanner;

public class ComboDevice extends Device implements Print, Scanner {

	@Override
	public void processDoc(String doc) {
		System.err.println("Class: Combo Device -> " + doc);
	}

	@Override
	public void print(String doc) {
		System.err.println("Class: Combo Device -> " + doc);
	}

	@Override
	public String scan() {
		return "Class: Combo Device -> Interface Scanner!";
	}

}
