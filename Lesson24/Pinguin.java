package Lesson24;

public class Pinguin extends Bird {

    @Override
    void eat() {
        System.out.println("Pinguins love to eat fish");
    }
    @Override
    void sleep (){
        System.out.println("They sleep very close to each other");
    }
    @Override
    void speak (){
        System.out.println("Pinguins can't sing like birds");
    }
}
