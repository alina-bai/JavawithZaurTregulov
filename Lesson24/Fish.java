package Lesson24;

abstract class Fish extends Animal {

    Fish(String name) {
        super(name);
        this.name = name;
    }
   public void sleep(){
       System.out.println("Its always interesting to watch how fish sleep");
   }
   abstract void swim();
}
