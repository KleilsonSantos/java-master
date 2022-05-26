package br.com.java.model.entities;

import br.com.java.model.services.Colors;

public class Rectangle extends Shape{

	private Double largerBase;
	private Double smallerBase;
	
	private Colors colors;
	
	public Rectangle() {
	}

	public Rectangle(Double largerBase, Double smallerBase, Colors colors) {
		this.largerBase = largerBase;
		this.smallerBase = smallerBase;
		this.colors = colors;
	}


	public Double getLargerBase() {
		return largerBase;
	}

	public void setLargerBase(Double largerBase) {
		this.largerBase = largerBase;
	}

	public Double getSmallerBase() {
		return smallerBase;
	}

	public void setSmallerBase(Double smallerBase) {
		this.smallerBase = smallerBase;
	}
	
	
	public Colors getColors() {
		return colors;
	}

	public void setColors(Colors colors) {
		this.colors = colors;
	}
	
	@Override
	public double area() {
		return largerBase * smallerBase;
	}

	@Override
	public String showString() {
		return "Implements: Interface -> Shape in Rectangle class.";
	}

}
