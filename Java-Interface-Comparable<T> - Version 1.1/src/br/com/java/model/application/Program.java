package br.com.java.model.application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import br.com.java.model.entities.Employee;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String path = "/home/operador/users.csv";
		List<Employee> listStr = new ArrayList<>();

		File file = new File(path);
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = br.readLine();
			while (line != null) {
				String[] vectEmployee = line.split(",");
				listStr.add(new Employee(vectEmployee[0], Double.parseDouble(vectEmployee[1])));
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Collections.sort(listStr);
		for (Employee string : listStr) {
			System.out.println(string);
		}
	}
}
