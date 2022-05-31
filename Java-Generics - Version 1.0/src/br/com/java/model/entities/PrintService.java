package br.com.java.model.entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

	private List<Integer> listInt = new ArrayList<>();

	public PrintService() {
	}

	public void addValue(int value) {
		listInt.add(value);
	}

	public Integer first() {
		if (listInt.isEmpty()) {
			throw new IllegalAccessError("List is empty");
		} else {
			return listInt.get(0);
		}
	}

	public void print() {
		if (listInt.isEmpty()) {
			throw new IllegalAccessError("List is empty");
		}
		Integer first = listInt.get(0);
		System.out.print("[" + first);
		for (int i = 1; i < listInt.size(); i++) {
			Integer element = listInt.get(i);
			System.out.print("," + element);
		}
		System.out.print("]\n");
	}

}
