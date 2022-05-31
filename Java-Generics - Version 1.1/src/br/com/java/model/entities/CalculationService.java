package br.com.java.model.entities;

import java.util.List;

public class CalculationService{

	public CalculationService() {
	}

	public static <T extends Comparable<T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalAccessError("List is empty");
		}
		T max = list.get(0);
		for (T item : list) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
	
}
