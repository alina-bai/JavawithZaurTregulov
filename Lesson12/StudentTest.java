package org.example.Lesson12;

public class StudentTest {
    public static void method1 (Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade){
            System.out.println("The students are identical");
        } else {
            System.out.println("The students are not identical");
        }
    }
    public static void method2 (Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if(st1.course == st2.course) {
                if(st1.grade == st2.grade) {
                    System.out.println("The names, grades and the courses are identical");
                } else {
                    System.out.println("The names and the courses of the students are similar but the grades are different");
                }
            } else {
                System.out.println("The names are identical but the courses are different ");
            }
            }  else {
                System.out.println("The name are different");
            }
        }

    public static void main(String[] args) {
        Student s1 = new Student("Ivan",2,5.5);
        Student s2 = new Student("Ivan",2, 5.5);
        method1(s1, s2);
        method2(s1, s2);

    }
    }




