package Desafios3;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void Executar() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudant estudante = new Estudant();
		
		System.out.println("Name:");
		estudante.Name = sc.next();
		System.out.println("NOTE 1: ");
		estudante.grade1 = sc.nextDouble();
		System.out.println("NOTE 2: ");
		estudante.grade2 = sc.nextDouble();
		System.out.println("NOTE 3: ");
		estudante.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", estudante.FinalGrade());
		
		if (estudante.FinalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", estudante.MissingPoints());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();
	}
}
