package Atividades;

import java.util.Locale;
import java.util.Scanner;

import Static.Calculator;

public class Atividade014 {
	
	public static void Executar()
	{
		
		//importando metodos staticos da classe calculator
		Calculator calc = new Calculator();
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius: ");
		
		double radius = sc.nextDouble();
		
		double c = calc.Circumference(radius);
		
		double v = calc.Volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume : %.2f%n", v);
		System.out.printf("Pi: %.2f%n", calc.PI);
		
		sc.close();
	}
	
}
