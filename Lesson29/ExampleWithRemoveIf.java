package Lesson29;
import java.util.*;
public class ExampleWithRemoveIf {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 15, 20, 25, 30));

        // Удаляем числа, которые больше 10 и меньше 30
        numbers.removeIf(n -> n > 10 && n < 30);

        System.out.println(numbers); // Вывод: [10, 30]
    }
}
