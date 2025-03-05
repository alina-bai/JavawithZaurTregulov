package Lesson28;
import java.sql.SQLOutput;
import java.time.*;
import java.time.format.*;


public class Lesson28Homework {
    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    public void smena(LocalDateTime start, LocalDateTime end, Period p, Duration d) {
        LocalDateTime ltd = start;
        while( ltd.isBefore(end))
            System.out.println("Работаем с " + ltd.format(f1));
            ltd = ltd.plus(p);
        System.out.println("До: "+ ltd.format(f1));
        System.out.println("Отдыхаем " + ltd.format(f2));
        ltd = ltd.plus(d);
        System.out.println(" До: " + ltd.format(f2));
    }

}
