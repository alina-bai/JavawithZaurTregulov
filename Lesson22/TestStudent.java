package Lesson22;

public class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        StringBuilder sb1 = new StringBuilder("Ivan");
        st1.setName(sb1);
        st1.setCourse(2);
        st1.setGrade(5);
        st1.ShowInfo();
    }

}
