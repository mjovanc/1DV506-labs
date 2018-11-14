package mc222sn_lab1;

import java.util.Scanner;

public class Area {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Ange en cirkelradie: ");
		double radius = in.nextDouble();
		
		in.close();
		
		double PI = Math.PI;
		double area = PI * Math.pow(radius, 2);
		
		System.out.printf("\nCirkelns area är: %.1f", area);
	}
	
}
