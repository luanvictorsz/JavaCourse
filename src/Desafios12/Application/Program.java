package Desafios12.Application;

import java.awt.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i = 0; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.println("outsourced (y/n)?");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			double hours = sc.nextDouble();
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
		}
		
		sc.close();
	}
}
