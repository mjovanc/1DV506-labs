package mc222sn_lab1;

import java.util.Scanner;

public class Tid {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Ange antal sekunder: ");
		int secondsInput = in.nextInt();
		
		in.close();
		
		int hours = secondsInput / 3600;
		int minutes = (secondsInput % 3600) / 60;
		int seconds = secondsInput % 60;
		
		System.out.printf("Detta motsvarar: %d timmar, %d minuter och %d sekunder.", hours, minutes, seconds);
	}
}
