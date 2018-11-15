package mc222sn_lab1;

import java.util.Scanner;

public class VindAvkylning {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Ange temperatur (C): ");
		double temperature = in.nextDouble();
		
		System.out.print("Ange vindhastigheten (m/s): ");
		double windSpeed = in.nextDouble();
		
		in.close();
		
		double convertedWindSpeed = windSpeed * 3.6;
		double twc = 13.12 + 0.6215 * temperature - 11.37 * Math.pow( convertedWindSpeed, 0.16) + 0.3965 * temperature * Math.pow( convertedWindSpeed, 0.16);
		
		System.out.printf("\nUppleved temperatur (C): %.1f", twc);
	}

}
