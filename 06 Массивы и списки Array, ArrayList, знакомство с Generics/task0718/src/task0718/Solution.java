package task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай 10 строк с клавиатуры и добавь их в список.
3. Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
4. Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        final int size = 10;
        ArrayList<String> words = new ArrayList<>(size);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.printf("Необходимо ввести %d слов", size);
        for (int i = 0; i < size; i++) {
            System.out.printf("введите слово № %d из %d .", i, size - 1);
            String current = reader.readLine();
            words.add(current);
        }

        int previousLength = 0;
        for (int i = 0; i < size; i++) {
            if (words.get(i).length() < previousLength) {
                System.out.println(i);
                break;
            } else {
                previousLength = words.get(i).length();
            }
        }
    }
}

