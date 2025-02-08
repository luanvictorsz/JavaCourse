package Static;

public class Calculator {
	

	//Pi é um valor estatico imutavel
	
	public static double PI = 3.14159;
	
	//a Circuferencia tambem possui um valor estatico 
	public static double Circumference(double radius)
	{
		return 2.0 * PI * radius; 
	}

	public static double Volume(double radius)
	{
		 return 4.0 * PI * radius * radius / 3.0; 
	}
	
	//obs: eu posso chamar a classe direta sem precisar instanciar no nosso programa, os valores não serão modificados
}
