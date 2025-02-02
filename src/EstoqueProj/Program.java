package EstoqueProj;
import java.util.Scanner;

public class Program {
	public static void Executar()
	{
		Product p = new Product();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		p.Name = sc.next();
		System.out.println("Price: ");
		p.Price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		p.Quantity = sc.nextInt();
		
		System.out.println(p.Name +", " + p.Price + ", " + p.Quantity);
		
		sc.close();
	
	}
}
