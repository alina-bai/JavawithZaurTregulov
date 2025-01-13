package org.example.Lesson11;

public class CarTest {

    void changeDoorCount (Car c, int doorCount){
        c.doorCount=doorCount;
    }

    void changeColor ( Car c1, Car c2){
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car("red", "v4", 2);
        Car car2 = new Car("yellow", "v6", 4);
        ct.changeDoorCount(car1, 3);
        ct.changeColor(car1, car2);
        System.out.println("ИНформация о первой машине: " + "цвет: " + car1.color + ".  мотор: "
                + car1.engine + ". Колличество дверей: " + car1.doorCount);
        System.out.println("ИНформация о первой машине: " + "цвет: " + car2.color + ".  мотор: "
                + car2.engine + ".  Колличество дверей: " + car2.doorCount);

    }

}
