package Atividades;

public class AtividadeFixacao {
	private int number;
	private String holder;
	private double balance;
	

	public AtividadeFixacao(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public AtividadeFixacao(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	
	
}
