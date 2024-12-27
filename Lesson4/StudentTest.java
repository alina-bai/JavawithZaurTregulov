package org.example.Lesson4;

public class StudentTest {
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
        st2.mathAverageGrade = 8;
        st2.economicsAverageGrade = 9;
        st2.foreignLanguageAverageGrade=10;

        Student st3 = new Student();
        st3.studentId = 3;
        st3.course = 5;
        st3.name = "Azamat";
        st3.surname = "Kasymal";
        st3.mathAverageGrade = 8;
        st3.economicsAverageGrade = 7;
        st3.foreignLanguageAverageGrade=9;


        System.out.println("Средняя арифметическая оценка " +st1.name +" " +st1.surname + "=" +
                (st1.mathAverageGrade+ st1.economicsAverageGrade+ st1.foreignLanguageAverageGrade)/3);

        System.out.println("Средняя арифметическая оценка " +st2.name +" " +st2.surname + "=" +
                (st2.mathAverageGrade+ st2.economicsAverageGrade+ st2.foreignLanguageAverageGrade)/3);

        System.out.println("Средняя арифметическая оценка " +st3.name +" " +st3.surname + "=" +
                (st3.mathAverageGrade+ st3.economicsAverageGrade+ st3.foreignLanguageAverageGrade)/3);

    }

}
