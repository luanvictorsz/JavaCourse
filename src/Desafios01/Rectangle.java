package Desafios01;

public class Rectangle {
	
	public double Widht;
	public double Height;
	
	public static double Area(double width, double height) 
	{
		return width * height;
	}
	
	public static double Perimeter(double width, double height)
	{
		return 2 * (width + height);
	}
	
	public static double Diagonal(double width, double height)
	{
		return Math.sqrt(width * width + height * height);
	}
	
}
