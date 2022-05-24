package br.com.java.section18.model.entities;

import br.com.java.section18.model.services.Colors;

public class Circle extends Shape{

	private double raio;
	private Colors color;
	
	public Circle() {
	}

	public Circle(double raio, Colors colors) {
		this.raio = raio;
		this.color = colors;
	}


	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public Colors getColor() {
		return color;
	}

	public void setColor(Colors color) {
		this.color = color;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}

	@Override
	public String showString() {
		return "Implements: Interface \nShape in Circle class.";
	}

}
