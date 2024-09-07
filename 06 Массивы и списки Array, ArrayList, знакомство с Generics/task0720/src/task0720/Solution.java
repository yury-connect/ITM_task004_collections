package task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
3. Переставить M первых строк в конец списка.
4. Выведи список на экран, каждое значение с новой строки.*/

public class Solution {
    public static void main(String[] args) throws IOException {

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   // закомментировал для тестирования
//        System.out.println("Введите общее количество вносимых строк (N)");   // закомментировал для тестирования
//        final int sizeN = Integer.parseInt(reader.readLine());   // закомментировал для тестирования
//        System.out.println("Введите количество переставляемых строк (M)");   // закомментировал для тестирования
//        final int movedM = Integer.parseInt(reader.readLine());   // закомментировал для тестирования

            final int sizeN = 5;   // Тестовые данные (для тестирования)
            final int movedM = 3;   // Тестовые данные (для тестирования)

        ArrayList<String> strings = new ArrayList<>(sizeN);

        strings.add("строка № 1");   // Тестовые данные (для тестирования)
        strings.add("строка № 2");   // Тестовые данные (для тестирования)
        strings.add("строка № 3");   // Тестовые данные (для тестирования)
        strings.add("строка № 4");   // Тестовые данные (для тестирования)
        strings.add("строка № 5");   // Тестовые данные (для тестирования)
//        for (int i = 0; i < sizeN; i++) {   // закомментировал для тестирования
//            System.out.printf("введите строку № %d из %d .", i + 1, sizeN);   // закомментировал для тестирования
//            String current = reader.readLine();   // закомментировал для тестирования
//            strings.add(current);   // закомментировал для тестирования
//        }


        System.out.printf("\tN = %d;\n\tM = %d;\n\tВведен исходный список:\n", sizeN, movedM);
        print(strings);

        for (int i = movedM; i > 0; i--) {
            String tmp = strings.remove(i - 1);
            strings.add((sizeN - 1) - (movedM - i), tmp); // Общая длинна списка МИНУС порядковый номер текущей итерации по циклу
        }
        System.out.println("\tРезультат работы программы:");
        print(strings);
    }

    private static void print(List<String> list) {
        list.stream().forEach(System.out::println);
        System.out.println();
    }
}
