package Lesson26;

public class Lion extends Mammal {
    Lion() {System.out.println("Constructor of Lion");}

    static {System.out.println("Static init in Lion"); }
    {System.out.println("Non-static init in Lion"); }
}

