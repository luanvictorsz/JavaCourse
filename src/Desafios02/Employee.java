package Desafios02;

public class Employee {
	
	public String Name;
	public double GrossSalary;
	public double Tax;

    public Employee(String name, int hours, double valuePerHour) {
    }

    public double netSalary() {
		return GrossSalary - Tax;
	}
	
	public void increaseSalary(double percentage) {
		GrossSalary += GrossSalary * percentage / 100.0;
	}
	
	public String toString() {
		return Name + ", $ " + String.format("%.2f", netSalary());
	}
}
