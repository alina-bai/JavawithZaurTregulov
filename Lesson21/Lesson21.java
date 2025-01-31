package org.example.Lesson21;

public class Lesson21 {
    public static void main(String[] args) {
        // Создаём объект класса Doctor
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 45;
        doc.experience = 20;
        doc.specializaciya = "Хирург";
        doc.eat(); // метод из Employee
        doc.sleep(); // метод из Employee
        doc.lechit(); // метод Doctor

        System.out.println("Доктор " + doc.name + ", возраст: " + doc.age + ", опыт: " + doc.experience + " лет, специализация: " + doc.specializaciya);

        // Создаём объект класса Teacher
        Teacher teacher = new Teacher();
        teacher.name = "Anna";
        teacher.age = 30;
        teacher.experience = 8;
        teacher.kolichestvouchenikov = 25;
        teacher.eat();
        teacher.sleep();
        teacher.uchit();

        System.out.println("Учитель " + teacher.name + ", возраст: " + teacher.age + ", стаж: " + teacher.experience + " лет, учеников: " + teacher.kolichestvouchenikov);

        // Создаём объект класса Driver
        Driver driver = new Driver();
        driver.name = "Sergey";
        driver.age = 40;
        driver.experience = 15;
        driver.nazvanicnashin = "Mercedes";
        driver.eat();
        driver.sleep();
        driver.vodit();

        System.out.println("Водитель " + driver.name + ", возраст: " + driver.age + ", стаж: " + driver.experience + " лет, машина: " + driver.nazvanicnashin);
    }
}

class Employee {
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("spat");
    }
}

class Doctor extends Employee {
    String specializaciya;

    void lechit() {
        System.out.println("Lechit");
    }
}

class Teacher extends Employee {
    int kolichestvouchenikov;

    void uchit() {
        System.out.println("Uchit");
    }
}

class Driver extends Employee {
    String nazvanicnashin;

    void vodit() {
        System.out.println("Vodae");
    }
}
