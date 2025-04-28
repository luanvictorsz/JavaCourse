package Desafios11.Application;

import Desafios11.Entities.Account;
import Desafios11.Entities.BusinessAccount;

public class Program {
    Account acc = new Account(1001, "Alex", 0.0);
    BusinessAccount bacc = new BusinessAccount(1002, "Victor", 0.0, 500.0);

    //Upcasting - Atribuindo uma conta empresario para uma conta padrão
    Account acc1 = bacc;
}
