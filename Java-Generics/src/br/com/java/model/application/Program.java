package br.com.java.model.application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);
		List<Integer> list = new ArrayList<>();
		
		int[] vect = {12,53,2,5};
		for (int i = 0; i < vect.length; i++) {
			list.add(vect[i]);
		}
	
		//System.err.println("Resultado do vetor de Pessoas");
		/*
		 * try (BufferedReader br = new BufferedReader(new FileReader(file))){ String
		 * line = br.readLine(); while(line != null) { String[] vect = line.split(",");
		 * System.out.println(line); list.add(new Pessoa(vect[0], vect[1])); line =
		 * br.readLine(); } } catch (Exception e) { e.getMessage(); }
		 * System.err.println("Resultado da Lista de Pessoas"); for (Pessoa pessoa :
		 * list) { System.out.println(pessoa); }
		 */
		
	}
	
}
