package Lesson28;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class TestHomework {
    public static void main(String[] args) {
        LocalDateTime ltd1 = LocalDateTime.of(2016, 01,01,9,0,0
        );
        LocalDateTime ltd2= LocalDateTime.of(2016, 10 , 31, 18, 0, 0);
        Period p = Period.of(0, 1, 2);
        Duration d =Duration.ofMinutes(600);
        Lesson28Homework l = new Lesson28Homework();
        l.smena(ltd1, ltd2, p, d);
    }

}
