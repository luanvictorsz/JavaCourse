package Desafios14.Entities;

public class Company {
    private int numberOfEmployees;

    public Company(){};

    public Company(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
