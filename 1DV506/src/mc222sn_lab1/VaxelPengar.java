package mc222sn_lab1;

import java.util.Scanner;

public class VaxelPengar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ange kostnaden: ");
		double cost = in.nextDouble();
		
		System.out.println("Ange erhållet belopp: ");
		double amount = in.nextDouble();
		
		int amountBack = (int) Math.round(amount - cost);
		
		System.out.printf("Tillbaka: %d", amountBack);
	}
}
