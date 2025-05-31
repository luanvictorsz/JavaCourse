package Desafios14.Entities;

public abstract class TaxPayer {
    private String name;
    private double anualIncome;

    public TaxPayer(){};

    public TaxPayer(String name, double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public abstract double Tax();
}
