package br.com.java.model.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import br.com.java.model.entities.CalculationService;
import br.com.java.model.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);
		String path = "/home/operador/produtos.csv";
		List<Product> listProduct = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] vectProduct = line.split(",");
				listProduct.add(new Product(vectProduct[0], Double.parseDouble(vectProduct[1])));
				line = br.readLine();
			}

		} catch (Exception e) {
			e.getMessage();
		}

		Product x = CalculationService.max(listProduct);
		System.out.println(x);
	}

}
