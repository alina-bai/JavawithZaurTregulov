package Lesson26;

public class Animal {
    Animal(){System.out.println("Constructor of animal");}

    static {System.out.println("Static init in Animal"); }
    {System.out.println("Non-static init in Animal"); }
}
