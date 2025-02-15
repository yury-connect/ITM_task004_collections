package task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
1. В методе initializeArray():
1.1. Создай массив на 20 чисел
1.2. Считай с консоли 20 чисел и заполни ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива


Requirements:
1. Метод initializeArray должен создавать массив из 20 целых чисел.
2. Метод initializeArray должен считать 20 чисел и вернуть их в виде массива.
3. Метод max должен возвращать максимальный элемент из переданного массива.
4. Метод main изменять нельзя.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int size = 20;

        System.out.println("Создан массив из " + size + " элементов. Заполним его:");
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Введите элемент № '%d' из '%d'", i + 1, size);
            result[i] = Integer.parseInt(reader.readLine());
        }
        return result;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int item: array) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }
}
