package Desafios14.Application;

import Desafios14.Entities.Company;
import Desafios14.Entities.Individual;
import Desafios14.Entities.TaxPayer;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<TaxPayer> list = new ArrayList<TaxPayer>();

        System.out.println("Enter the number of tax payers: ");
        int n = sc.nextInt();

        System.out.println("Individual or Company?: (I/C)");

        for(int i = 0; i <= n; i++){
            System.out.println("Taxpayer #" + i + " data: ");
            System.out.println("Individual or Company (i/c): ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual Income: ");
            Double anualIncome = sc.nextDouble();
            if(type == 'i'){
                System.out.println("Health expenditures: ");
                Double he = sc.nextDouble();
                list.add(new Individual(name, anualIncome, he));
            }
            else {
                System.out.println("Number of employees: ");
                Integer numberOfEmployee = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployee));
            }
        }
    }
}
