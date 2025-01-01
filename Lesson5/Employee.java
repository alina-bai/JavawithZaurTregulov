package org.example.Lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee (int id2, String surname2, int age2, double salary2, String department2){
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;

    }
 double uvelechenieZarplaty () {
        salary *= 2;
        return salary;

 }

}
