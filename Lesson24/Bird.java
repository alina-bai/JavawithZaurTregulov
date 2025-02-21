package Lesson24;

abstract class Bird extends Animal implements Speakable {
    String name;

    abstract void fly ();
    public void speak (){
        System.out.println(name + "sings");
    }


}
