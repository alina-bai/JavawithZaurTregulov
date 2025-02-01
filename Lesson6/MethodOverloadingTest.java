package Lesson6;

public class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading  s = new MethodOverloading();
        s.sum();
        s.sum(3);
        s.sum(3+5);
        s.sum(3+5+7);
        s.sum(3+5+7+11);
    }

}
