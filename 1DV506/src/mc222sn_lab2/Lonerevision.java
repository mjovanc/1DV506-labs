package mc222sn_lab2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Generates statistics of input of salaries with median, average and range.
 * 
 * @author Marcus Cvjeticanin
 */
public class Lonerevision
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> salaries = new ArrayList<Integer>();

		int medianSalary = 0;
		int averageSalary = 0;
		int range = 0;

		System.out.print("Mata in löner (och avsluta med 'X'): ");

		while (in.hasNextInt())
		{
			salaries.add(in.nextInt());
		}

		in.close();

		Collections.sort(salaries);

		for (int i = 0; i < salaries.size(); i++)
		{
			averageSalary += salaries.get(i);
		}

		averageSalary /= salaries.size();
		range = salaries.get(salaries.size() - 1) - salaries.get(0);

		if (salaries.size() % 2 == 0)
		{
			medianSalary = (salaries.get(salaries.size() / 2) + salaries.get((salaries.size() / 2) - 1)) / 2;
		}
		else
		{
			medianSalary = salaries.get((salaries.size() - 1) / 2);
		}

		System.out.printf("Medianlön: %d\n", medianSalary);
		System.out.printf("Medellön: %d\n", averageSalary);
		System.out.printf("Lönespridning: %d\n", range);
	}
}
