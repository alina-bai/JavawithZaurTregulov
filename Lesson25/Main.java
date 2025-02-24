package Lesson25;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Mechenosec("kar1_1");
        Animal a2 = new Pinguin("Kovalski_ 1");
        Animal a3 = new Lion("Leva_1");
        Fish f1 = new Mechenosec("Karl_2");
        Bird b1 = new Pinguin("Kovalski_2");
        Mammal m1 = new Lion("Leva 2");
        Mechenosec mech1 = new Mechenosec("Karl_ 3");
        Pinguin p1 = new Pinguin("kovalski_3");
        Lion l1 = new Lion("Leva 3");
        Speakable s1 = new Pinguin("Kovals)i_4");
        Speakable s2 = new Lion("Leva_4");
        Animal[] array1 = {a1, a2, a3, f1, b1, m1, mech1, p1, l1};
        Speakable[] array2 = {s1, s2, b1, m1, p1, l1};
        for (Animal a : array1) {
            if (a instanceof Mechenosec) {
                Mechenosec m = (Mechenosec) a;
                System.out.println(m.name);
                m.eat();
                m.sleep();
                m.swim();
            } else if (a instanceof Pinguin) {
                Pinguin p = (Pinguin) a;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            } else if (a instanceof Lion) {
                Lion l = (Lion) a;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();

            }
            System.out.println("__________________________________");

        }
        for (Speakable s : array2) {
            if (s instanceof Pinguin) {
                Pinguin p = (Pinguin) s;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            }
            System.out.println("_____________");
        }

    }
}
