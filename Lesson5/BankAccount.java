package Lesson5;

import java.sql.SQLOutput;

public class BankAccount {
    int id = 10;
    String name = "Petr";
    double balance = 100;

    void PopolnenieScheta (double summaPopolnenia) {
        System.out.println("Balans do popolneniya " + balance);
        System.out.println("Balans popolnyaetsya na " + summaPopolnenia);
        balance += summaPopolnenia;
        System.out.println("Balance posle popolneniya " + balance);
    }

    void snyatieSoScheta ( double summaSnyatiya) {
        System.out.println("Balans do snyatiya " + balance);
        System.out.println("Balans umenshaetsya na " +  summaSnyatiya);
        balance -= summaSnyatiya;
        System.out.println("Balans posle snyatiya " + balance);
    }

}
