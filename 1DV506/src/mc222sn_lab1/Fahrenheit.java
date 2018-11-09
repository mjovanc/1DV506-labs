package mc222sn_lab1;

import java.util.Scanner;

public class Fahrenheit {
	
	public static void main(String[] args) {
		System.out.print("Ange en temperatur i Fahrenheit: ");
		
		Scanner in = new Scanner(System.in);
		double temp = in.nextDouble();
		in.close();
		
		double celsius = (temp - 32) * 5 / 9;
		
		System.out.printf("Motsvarande temperatur i Celsius är: %f\n", celsius);
	}
	
}
