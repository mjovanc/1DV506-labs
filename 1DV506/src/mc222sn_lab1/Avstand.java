package mc222sn_lab1;

import java.lang.Math;
import java.util.Scanner;

public class Avstand {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Ange första x och y-koordinaten (separera med mellanslag): ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		
		System.out.print("Ange andra x och y-koordinaten (separera med mellanslag): ");
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		
		in.close();
		
		double avstand = Math.sqrt( Math.pow( (x1 - x2), 2) + Math.pow( (y1 - y2), 2) );
		
		System.out.printf("\nBeräknat avstånd mellan punkterna: %.3f", avstand);
	}

}
