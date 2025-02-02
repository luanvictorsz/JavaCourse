package EstoqueProj;

public class Product {
	public String Name;
	public double Price;
	public int Quantity;
	

	public double TotalValueInStock() {
		return Price * Quantity;
	}
	
	public double AddInStock(int quantity) {
		return Quantity += quantity;
	}
	
	public double RemoveInStock(int quantity) {
		return Quantity -= quantity;
	}
	
	@Override
	public String toString() {
		return Name 
				+",  Price: R$" 
				+ Price
				+ ", "
				+ Quantity
				+ " Units"
				+ ", Total: $ " 
				+ TotalValueInStock();
	}
}
