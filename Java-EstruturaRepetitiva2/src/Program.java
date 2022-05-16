/*
 *
 */

/**
 * @author Kleilson Santos 
 *
 */

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int x = 5;
		int y = 0;
		
		while (x > 2) {
			y++;
			x += -1;
			System.out.print("x" + x + " ");
			System.out.println("y" + y);
		}
		scanner.close();
	}
}


