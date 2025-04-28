package Desafios11.Application;

import Desafios11.Entities.Account;
import Desafios11.Entities.BusinessAccount;
import Desafios11.Entities.SavingsAccount;

public class Program {
    Account acc = new Account(1001, "Alex", 0.0);
    BusinessAccount bacc = new BusinessAccount(1002, "Victor", 0.0, 500.0);

    //Upcasting - Atribuindo uma conta empresario para uma conta padrão
    Account acc1 = bacc;
    Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
    Account acc3 = new SavingsAccount(1004, "Paula", 0.0, 0.01);

    //DownCasting
    BusinessAccount acc4 = (BusinessAccount)acc2;
    //acc4.Loan(100.0);

    BusinessAccount acc5 = (BusinessAccount)acc3; //obs: existe um erro de excessão por conversão por não ser possivel converter para BusinessAccount
    //acc5.Loan(100.0);
}

