package Lesson23;

public class Test {
    public static void abc(X x, Y y) {
        System.out.println("privet");
    }
    public static void abc(Y y, X x) {
        System.out.println("poka");
    }
    public static void main(String[] args){
        Y a = new Y();
        abc(a,a); //Это выдает ошибку так как не знает какой брать X или Y
        }
    }

