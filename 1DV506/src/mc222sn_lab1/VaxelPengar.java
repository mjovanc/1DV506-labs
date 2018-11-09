package mc222sn_lab1;

import java.util.Scanner;

public class VaxelPengar {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Ange kostnaden: ");
		double cost = in.nextDouble();
		
		System.out.print("Ange erhållet belopp: ");
		double amount = in.nextDouble();
		in.close();
		
		int amountBack = (int) Math.round(amount - cost);
		
		System.out.printf("Tillbaka: %d kronor\n", amountBack);
		
		
		System.out.printf("1000-lappar: %d\n", amountBack / 1000); // radera 1000 från amountback
		System.out.printf(" 500-lappar: %d\n", amountBack / 500);
		System.out.printf(" 200-lappar: %d\n", amountBack / 200);
		System.out.printf(" 100-lappar: %d\n", amountBack / 100);
		System.out.printf("  50-lappar: %d\n", amountBack / 50);
		System.out.printf("  20-lappar: %d\n", amountBack / 20);
		System.out.printf("  10-kronor: %d\n", amountBack / 10);
		System.out.printf("   5-kronor: %d\n", amountBack / 5);
		System.out.printf("   2-kronor: %d\n", amountBack / 2);
		System.out.printf("   1-kronor: %d\n", amountBack / 1);
		
		
		
	}
	
}
