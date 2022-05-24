package br.com.java.section18.model.application;

import java.util.Locale;

import br.com.java.section18.model.entities.Circle;
import br.com.java.section18.model.entities.Rectangle;
import br.com.java.section18.model.services.Colors;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);
		
		Circle circle1 = new Circle(3.0, Colors.CORAL);
		Circle circle2 = new Circle(5.0, Colors.GREEN);
		Rectangle rectangle1 = new Rectangle(10.0, 20.0,Colors.BLUE);
		Rectangle rectangle2 = new Rectangle(10.0, 20.0,Colors.CORAL);
		
		System.out.println("Circle area: " + String.format("%.2f", circle1.area()));
		System.out.println("Circle area: " + String.format("%.2f", circle2.area()));
		System.out.println("Rectangle area: " + String.format("%.2f", rectangle1.area()));
		System.out.println("Rectangle area: " + String.format("%.2f", rectangle2.area()));
		System.err.println(circle1.showString());
		System.err.println(rectangle1.showString());
	}
	
}
