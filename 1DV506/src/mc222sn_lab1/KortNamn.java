package mc222sn_lab1;

import java.util.Scanner;

public class KortNamn {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Förnamn: ");
		String firstName = in.nextLine();
		
		System.out.print("Efternamn: ");
		String lastName = in.nextLine();
		
		char firstLetter = firstName.charAt(0);
		String shortLastName = lastName.substring(0, Math.min(4, lastName.length()));
		
		System.out.printf("Kort namn: %c. %s", firstLetter, shortLastName);
	}
}
