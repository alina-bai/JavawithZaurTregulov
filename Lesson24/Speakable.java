package Lesson24;

interface Speakable {
   default void speak() {
       System.out.println("Somebody speaks");
   };
    }

