package Lesson5;
public class StudentTest {
    double sredArifmOcenka ( Student st) {
        double sredOcenka = (st.mathAverageGrade + st.economicsAverageGrade + st.foreignLanguageAverageGrade) / 3;
        System.out.println("Srednyaya arifmeticheskaya ocenka studenta  " + st.name + " " + st.surname + ": " + sredOcenka);
        return sredOcenka;
    }

    public static void main(String[] args) {
        Lesson5.Student st1 = new Lesson5.Student();
        st1.studentId = 1;
        st1.course = 4;
        st1.name = "Aktan";
        st1.surname = "Kasymaliev";
        st1.mathAverageGrade = 10;
        st1.economicsAverageGrade = 9;
        st1.foreignLanguageAverageGrade=10;

        Lesson5.Student st2 = new Lesson5.Student();
        st2.studentId = 2;
        st2.course = 3;
        st2.name = "Ariet";
        st2.surname = "Kasymalie";
        st2.mathAverageGrade = 8;
        st2.economicsAverageGrade = 9;
        st2.foreignLanguageAverageGrade=10;

        Lesson5.Student st3 = new Student();
        st3.studentId = 3;
        st3.course = 5;
        st3.name = "Azamat";
        st3.surname = "Kasymal";
        st3.mathAverageGrade = 8;
        st3.economicsAverageGrade = 7;
        st3.foreignLanguageAverageGrade=9;

        StudentTest sTest = new StudentTest();
        sTest.sredArifmOcenka(st1);
        sTest.sredArifmOcenka(st2);
        sTest.sredArifmOcenka(st3);


    }

}
