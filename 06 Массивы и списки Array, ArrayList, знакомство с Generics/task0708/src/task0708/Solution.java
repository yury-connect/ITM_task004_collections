package task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.


Requirements:
1. В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
2. Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
3. Программа должна выводить самую длинную строку на экран.
4. Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        List<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int size = 5;
        int maxLength = 0;
        for (int i = 0; i < size; i++) {
            System.out.printf("введите строку № %d из %d строк.", i + 1, size);
            String current = reader.readLine();
            strings.add(current);

            if (current.length() > maxLength) {
                maxLength = current.length();
            }
        }

        for (String item: strings) {
            if (item.length() == maxLength) {
                System.out.println(item);
            }
        }
    }
}
