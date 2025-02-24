package Lesson25;

public class Lion extends Mammal {
    Lion (String name) {
        super(name);
        this.name = name;
    }
    public void eat () {
        System.out.println("Lions as any carnivours love meat");
    }

    public void sleep (){
        System.out.println("Most of the day lions sleep");
    }

    public void run (){
        System.out.println("Lion is not the fastest cat");
    }



}
