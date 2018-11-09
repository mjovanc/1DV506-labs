package mc222sn_lab1;

import java.util.Scanner;

public class Ranta {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Besparingar år noll: ");
		int savings = in.nextInt();
		
		System.out.print("Årsränta (i procent): ");
		int interest = in.nextInt();
		in.close();
		
		double sum = savings * Math.pow(1 + (double) interest / 100, 5);
		int roundedSum = (int) Math.round(sum);
		
		System.out.printf("Värdet på besparingarna efter fem år är %d\n", roundedSum);
	}

}
