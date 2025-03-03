package Lesson26;

public class Mammal extends Animal {
    Mammal(){System.out.println("Constructor of Mammal");}

    static {System.out.println("Static init in Mammal"); }
    {System.out.println("Non-static init in Mammal"); }
}
