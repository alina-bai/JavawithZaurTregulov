package org.example.Lesson20;
import java.util.*;
public class Lesson20 {

        // Метод abc принимает переменное количество аргументов типа String
        public static ArrayList<String> abc(String... args) {
            // 1. Создаём HashSet, чтобы хранить только уникальные строки
            Set<String> uniqueStrings = new HashSet<>(Arrays.asList(args));

            // 2. Преобразуем Set в ArrayList
            ArrayList<String> sortedList = new ArrayList<>(uniqueStrings);

            // 3. Сортируем ArrayList
            Collections.sort(sortedList);

            // 4. Выводим список на экран
            System.out.println(sortedList);

            // 5. Возвращаем отсортированный список
            return sortedList;
        }

        public static void main(String[] args) {
            // Пример использования метода
            abc("apple", "banana", "cherry", "apple", "banana", "date", "cherry", "fig");
        }
    }


