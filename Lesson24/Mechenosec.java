package Lesson24;

abstract class Mechenosec extends Fish {
    String name;

    @Override
    void swim(){
        System.out.println("Mechenosec is a beautiful fish, which swims fast");
    }

    @Override
    void eat() {
        System.out.println("Mechenosec is not carnivor,and she eats the normal fish food");
    }
}
