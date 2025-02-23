package Lesson24;

public class Main {
    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("Karl");
        m.eat();
        m.sleep();
        m.swim();
        Speakable s1 = new Pinguin("Kovalski");
        s1.speak();
        Animal a = new Lion("Lionel");
        System.out.println(a.name);
        a.eat();
        a.sleep();
        Mammal mam = new Lion("Lionel2");
        System.out.println(mam.name);
        mam.eat();
        mam.sleep();
        mam.run();
        mam.speak();


    }
}
