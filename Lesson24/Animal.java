package Lesson24;

abstract class Animal {
    Animal(String name) {
        this.name = name;
    }
        String name;
        abstract void eat ();
        abstract void sleep ();

}
