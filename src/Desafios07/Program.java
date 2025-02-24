package Desafios07;
import java.util.Scanner;

public class Program {
	public static void Executar()
	{
		Product p = new Product();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		p.Name = sc.nextLine();
		System.out.println("Price: ");
		p.Price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		p.Quantity = sc.nextInt();
		
		System.out.println(p);
		
		System.out.println("Enter the number of products to be added in stock: ");
		int qtdAdd = sc.nextInt();
		p.AddInStock(qtdAdd);
		System.out.println();
		System.out.println("Updated data: " + p);
		
		System.out.println("Enter the number of products to be removed from stock: ");
		int qtdRemove = sc.nextInt();
		p.RemoveInStock(qtdRemove);
		System.out.println();
		System.out.println("Updated data: " + p);
		
		sc.close();
	
	}
}
