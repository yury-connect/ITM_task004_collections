package task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Массив из строчек в обратном порядке
1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.


Requirements:
1. Программа должна создавать массив на 10 строк.
2. Программа должна считывать 8 строк для массива с клавиатуры.
3. Программа должна выводить на экран 10 строк, каждую с новой строки.
4. Программа должна выводить на экран массив (10 элементов) в обратном порядке.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int size = 10;
        final int sizeActual = size - 2;
        System.out.printf("\nСоздан массив из '%d' элементов. \nЗаполним первые '%d' его элементов.\n", size, sizeActual);
        String[] arr = new String[size];
        for(int i = 0; i < sizeActual ; i++) {
            System.out.printf("\nВведите элемент № '%d' из '%d' : ", i + 1, sizeActual);
            arr[i] = reader.readLine();
        }

        System.out.println("Введены следующие значения:");
        Arrays.stream(arr).forEach(i -> System.out.println(i));

        System.out.println("Вывожу все элементы массива в обратном порядке:");
        for (int i = size; i > 0; i--) {
            System.out.println(arr[i - 1]);
        }
    }
}