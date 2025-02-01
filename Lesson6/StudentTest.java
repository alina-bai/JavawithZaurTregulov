package Lesson6;

import Lesson6.Student;

public class StudentTest {
    double sredArifmOcenka ( Lesson6.Student st) {
        double sredOcenka = (st.mathAverageGrade + st.economicsAverageGrade + st.foreignLanguageAverageGrade)/3;
        System.out.println("Srednyaya arifmeticheskaya ocenka studenta  " + st.name +" " + st.surname + ": " + sredOcenka);
        return sredOcenka;
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.studentId = 1;
        st1.course = 4;
        st1.name = "Aktan";
        st1.surname = "Kasymaliev";
        st1.mathAverageGrade = 10;
        st1.economicsAverageGrade = 9;
        st1.foreignLanguageAverageGrade=10;

        Student st2 = new Student();
        st2.studentId = 2;
        st2.course = 3;
        st2.name = "Ariet";
        st2.surname = "Kasymalie";


        Student st3 = new Student(3, "Anton", "Sidirov", 4, 9.1, 9, 10);


        StudentTest sTest = new StudentTest();
        sTest.sredArifmOcenka(st1);
        sTest.sredArifmOcenka(st2);
        sTest.sredArifmOcenka(st3);


    }

}
