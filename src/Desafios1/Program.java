package Desafios1;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void Executar()
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		
		System.out.print("Enter rectangle width and height: ");
		rec.Widht = sc.nextDouble();
		rec.Height = sc.nextDouble();
		
		double results = rec.Area(rec.Widht, rec.Height);
		
		System.out.println(results);
		
		sc.close();
	}
}
