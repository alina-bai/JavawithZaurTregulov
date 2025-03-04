package Lesson28;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
    LocalDateTime dateTime = LocalDateTime.of(2025, 3, 5, 14, 30, 45);

    System.out.println("Год: " + dateTime.getYear()); // 2025
    System.out.println("Месяц: " + dateTime.getMonth()); // MARCH
    System.out.println("День месяца: " + dateTime.getDayOfMonth()); // 5
    System.out.println("День недели: " + dateTime.getDayOfWeek()); // WEDNESDAY
    System.out.println("Часы: " + dateTime.getHour()); // 14
    System.out.println("Минуты: " + dateTime.getMinute()); // 30
    System.out.println("Секунды: " + dateTime.getSecond()); // 45
}

}
