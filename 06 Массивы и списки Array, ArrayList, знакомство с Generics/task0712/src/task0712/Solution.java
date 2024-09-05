package task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
5. Должна быть выведена только одна строка.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int size = 10;

        int lenMaxLength = 0;
        int indexMaxLength = -1;

        int lenMinLength = Integer.MAX_VALUE;
        int indexMinLength = -1;

        for (int i = 0; i < size; i++) {
            System.out.printf("введите строку № %d из %d строк.", i + 1, size);
            final String current = reader.readLine();
            strings.add(current);

            if (current.length() > lenMaxLength) {
                lenMaxLength = current.length();
                indexMaxLength = strings.indexOf(current);
            }

            if (current.length() < lenMinLength) {
                lenMinLength = current.length();
                indexMinLength = strings.indexOf(current);
            }
        }

        if (indexMinLength < indexMaxLength) {
            System.out.println(strings.get(indexMinLength));
        } else {
            System.out.println(strings.get(indexMaxLength));
        }
    }
}
