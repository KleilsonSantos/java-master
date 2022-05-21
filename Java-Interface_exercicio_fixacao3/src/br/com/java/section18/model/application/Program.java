package br.com.java.section18.model.application;

import br.com.java.section18.model.entities.ComboDevice;

public class Program {

	public static void main(String[] args) {

		ComboDevice comboDevice = new ComboDevice();
		comboDevice.print("Interface Print!");
		comboDevice.processDoc("Metodo processDoc()");
		System.err.println(comboDevice.scan());
	}

}
