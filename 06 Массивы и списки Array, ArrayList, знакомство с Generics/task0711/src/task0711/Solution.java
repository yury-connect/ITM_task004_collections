package task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Программа должна выводить список на экран, каждое значение с новой строки.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int size = 5;
        int maxLength = 0;
        for (int i = 0; i < size; i++) {
            System.out.printf("введите строку № %d из %d строк.", i + 1, size);
            String current = reader.readLine();
            strings.add(0, current);
        }

        for (int i = 0; i < 13; i++) {
            String current = strings.remove(strings.size() - 1);
            strings.add(0, current);
        }

        for (String item: strings) {
            System.out.println(item);
        }
    }
}
