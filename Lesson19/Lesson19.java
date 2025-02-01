package Lesson19;

public class Lesson19 {
    public static String[] abs(String[]... arrays) {
    // Определяем размер нового массива
    int totalLength = 0;
    for (String[] array : arrays) {
        totalLength += array.length;
    }

    // Создаём новый массив
    String[] combinedArray = new String[totalLength];

    // Объединяем элементы из всех массивов
    int index = 0;
    for (String[] array : arrays) {
        for (String element : array) {
            combinedArray[index++] = element;
        }
    }

    return combinedArray;
}
    public static void main(String[] args) {
        // Примеры массивов
        String[] array1 = {"apple", "banana", "cherry"};
        String[] array2 = {"dog", "cat", "banana"};
        String[] array3 = {"elephant", "fox", "grape"};

        // Вызываем метод abs
        String[] combinedArray = abs(array1, array2, array3);

        // Заменяем элементы, совпадающие с аргументами командной строки, на null
        for (int i = 0; i < combinedArray.length; i++) {
            for (String arg : args) {
                if (combinedArray[i] != null && combinedArray[i].equals(arg)) {
                    combinedArray[i] = null;
                }
            }
        }

        // Выводим обновлённый массив
        for (String element : combinedArray) {
            System.out.println(element);
        }
    }

}
