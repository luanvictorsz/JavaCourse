package Desafios11.Entities;

public class BusinessAccount extends Account{
    private double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void Loan(double amount){
        if(amount <= loanLimit){
            balance += amount - 10.0;
        }
    }

}
