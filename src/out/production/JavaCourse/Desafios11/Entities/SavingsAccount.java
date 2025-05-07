package Desafios11.Entities;

public class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount(){
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void UpdateBalance(){
        balance += balance * interestRate;
    }

    //Sobreposição de  metodo com o Override;
    @Override
    public void Withdraw(double amount){
        balance -= amount;
    }

}
