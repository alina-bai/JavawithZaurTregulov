package Lesson29;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExampleWithPredicate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Оставляем только четные числа
        List<Integer> evenNumbers = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers); // Вывод: [2, 4, 6]
    }
}