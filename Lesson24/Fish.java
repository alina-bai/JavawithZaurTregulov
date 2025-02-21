package Lesson24;

abstract class Fish extends Animal {
   String name;

   public void sleep(){
       System.out.println("Its always interesting to watch how fish sleep");
   }
   abstract void swim();
}
