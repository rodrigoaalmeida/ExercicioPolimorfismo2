package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers:");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, income, healthExpenditures));
			}else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, income, numberOfEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double sum = 0.0;
		for(TaxPayer person : list) {
			System.out.println(person.getName() + String.format(": $ %.2f", person.tax()));
			sum += person.tax();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f %n", sum);
		
		sc.close();
	}

}
