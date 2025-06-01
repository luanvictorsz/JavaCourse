package Desafios14.Application;

import Desafios14.Entities.Company;
import Desafios14.Entities.Individual;
import Desafios14.Entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<TaxPayer> list = new ArrayList<>();

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
            double anualIncome = sc.nextDouble();
            if(type == 'i'){
                System.out.println("Health expenditures: ");
                double he = sc.nextDouble();
                list.add(new Individual(name, anualIncome, he));
            }
            else {
                System.out.println("Number of employees: ");
                int numberOfEmployee = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployee));
            }

            System.out.println();
            System.out.println("Taxes Paid: ");

            for(TaxPayer tp : list){
                System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.Tax()));
            }

            double sum = 0.0;

            for(TaxPayer tp: list){
                sum += tp.Tax();
            }

            System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

            sc.close();
        }
    }
}
