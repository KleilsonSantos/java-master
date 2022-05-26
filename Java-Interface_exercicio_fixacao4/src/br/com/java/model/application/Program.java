package br.com.java.model.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import br.com.java.model.entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Employee> list = new ArrayList<Employee>();

		try (BufferedReader br = new BufferedReader(new FileReader("/home/operador/users.csv"))) {
			String line = br.readLine();
			while (line != null) {
				String[] vect = line.split(",");
				list.add(new Employee(vect[0], Double.parseDouble(vect[1])));
				line = br.readLine();
			}
			Collections.sort((List<Employee>) list);
			for (Employee employer : list) {
				System.out.println(employer);
			}
		} catch (IOException e) {
			e.getMessage();
		}

	}
}
