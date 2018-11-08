package mc222sn_lab1;

import java.util.Scanner;

public class Ranta {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Besparingar år noll: ");
		int savings = in.nextInt();
		
		System.out.println("Årsränta (i procent): ");
		int interest = in.nextInt();
		in.close();
		
		double interestRate = (interest / 100);
		
		double sum = savings * Math.pow(1 + interestRate, 5);
		
		System.out.printf("Värdet på besparingarna efter fem år är %f\n", sum);

	}

}
