package org.example.Lesson5;

import java.sql.SQLOutput;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 25, 555,"IT");
        Employee emp2 = new Employee(2, "Petrov", 30, 888, "Sales");

        emp1.uvelechenieZarplaty();
        System.out.println("Novaya  zarplata " + emp1.surname + emp1.salary);

        emp2.uvelechenieZarplaty();
        System.out.println("Novaya zarplata "+ emp2.surname + emp2.salary);
    }


}

