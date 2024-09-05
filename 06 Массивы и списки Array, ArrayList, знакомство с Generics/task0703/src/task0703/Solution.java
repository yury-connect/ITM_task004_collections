package task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.


Requirements:
1. Программа должна создавать массив на 10 строк.
2. Программа должна создавать массив на 10 целых чисел.
3. Программа должна считывать строки для массива с клавиатуры.
4. Программа должна в массив чисел записать длины строк из массива строк, а затем их вывести на экран.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int size = 10;
        System.out.printf("\nСоздан массив из '%d' элементов. \nЗаполним его элементы.\n", size);
        String[] arr = new String[size];
        for(int i = 0; i < size ; i++) {
            System.out.printf("\nВведите элемент № '%d' из '%d' : ", i + 1, size);
            arr[i] = reader.readLine();
        }

        System.out.println("Введены следующие значения:");
        Arrays.stream(arr).forEach(i -> System.out.println(i));

        System.out.println("Вывожу массив со всеми длинами элементы массива строк");
        final int[] lengths = new int[size];
        for (int i = 0; i < size; i++) {
            lengths[i] = arr[i].length();
            System.out.println(lengths[i]);
        }
    }
}
