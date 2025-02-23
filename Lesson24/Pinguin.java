package Lesson24;
class Pinguin extends Bird {

    Pinguin (String name) {
        super(name);
        this.name = name;
    }


    public void eat() {
        System.out.println("Pinguins love to eat fish");
    }
    public void sleep (){
        System.out.println("They sleep very close to each other");
    }
    public void fly () {
        System.out.println("Pinguins can't fly");
    }
    public void speak () {
        System.out.println("Pinguins can't sing like birds");
    }
}
