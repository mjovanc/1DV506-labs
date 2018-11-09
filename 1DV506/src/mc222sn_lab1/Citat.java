package mc222sn_lab1;

import java.util.Scanner;

public class Citat {
	
	public static void main(String[] args) {
		System.out.print("Skriv in en rad text: ");
		
		Scanner in = new Scanner(System.in);
		String quote = in.nextLine();
		in.close();
		
		System.out.printf("Citat: \"%s\"\n", quote);
	}
}