package br.com.java.section18.model.application;

import br.com.java.section18.model.entities.ComboDevice;

public class Program {

	public static void main(String[] args) {

		ComboDevice comboDevice = new ComboDevice();
		comboDevice.processDoc("Metodo processDoc()");
		comboDevice.print("Interface Print!");
		System.err.println(comboDevice.scan());
		
	}

}
