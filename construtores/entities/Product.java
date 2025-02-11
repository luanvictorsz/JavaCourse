package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product() {
		//construtor sem os parametros
	}
	
	public Product(String Name, double Price /*, a quantity não está no parametro*/) {
		this.name = Name;
		this.price = Price;
		//sobrecarga
		this.quantity = 0;
	}
	
	
	//gets e setters para emcapsulamento
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}