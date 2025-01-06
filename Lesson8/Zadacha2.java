package org.example.Lesson8;

public class Zadacha2 {
    public final static double PI = 3.14;
    public double ploshad (double radius){
      double pl = PI * radius * radius;
      return pl;
    }

    public  static double dlina (double radius2){
    double dl = 2 * PI * radius2;
    return dl;
    }

    public void info (double radius3){
        System.out.println("Radius = " + radius3);
        System.out.println("Ploshad kruga "+ ploshad(radius3));
        System.out.println("Dlina okrujnosti "+ dlina(radius3));

    }


}
