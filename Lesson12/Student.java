package org.example.Lesson12;

public class Student {
    public String name;
    public int course;
    public double grade;

    public Student(String name, int course, double grade) {
        this.name=name;
        this.course=course;
        this.grade=grade;
    }

    public static void swap(Student s1,Student s2) {
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1.name);
    }

    public static void changeName(Student s1) {
        s1.name = "Vasilyi";
    }


}
