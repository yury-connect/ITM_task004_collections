package task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Золушку
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.


Requirements:
1. Объяви и сразу проинициализируй 4 переменных типа ArrayList<Integer> (список целых чисел). Первый список будет главным, а остальные - дополнительными.
2. Считать 20 чисел с клавиатуры и добавить их в главный список.
3. Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
4. Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
5. Добавить в третий дополнительный список все остальные числа из главного.
6. Метод printList должен выводить на экран все элементы переданного списка, каждый с новой строки.
7. Программа должна вывести три дополнительных списка, используя метод printList.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> src = new ArrayList<>();
        ArrayList<Integer> div3Items = new ArrayList<>();
        ArrayList<Integer> div2Items = new ArrayList<>();
        ArrayList<Integer> noDivItems = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final int size = 20;

        for (int i = 0; i < size; i++) {
            System.out.printf("введите элемент № %d из %d (целое число).", i + 1, size);
            final int current = Integer.parseInt(reader.readLine());
            src.add(current);
            boolean isDiv3 = current % 3 == 0;
            boolean isDiv2 = current % 2 == 0;

            if (isDiv3) {
                div3Items.add(current);
            }
            if (isDiv2) {
                div2Items.add(current);
            }
            if (!isDiv2 && !isDiv3) {
                noDivItems.add(current);
            }
        }

        System.out.println("\nВывожу список базовых элементов:");
        printList(src);

        System.out.println("\n(x % 3 == 0) элементы:");
        printList(div3Items);

        System.out.println("\n( x % 2 == 0) элементы:");
        printList(div2Items);

        System.out.println("\nВсе остальные элементы:");
        printList(noDivItems);
    }

    public static void printList(ArrayList<Integer> list) {
        for(Integer item: list) {
            System.out.println(item);
        }
    }
}
