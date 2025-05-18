package Desafios12.Application;

import Desafios02.Employee;
import Desafios12.Entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
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
			int hours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
		
			if(ch == 'y') {
				System.out.print("Addictional charge: ");
				double addictionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, addictionalCharge);
				list.add(emp);
			}
			else
			{
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
		}
		
		sc.close();
	}
}
