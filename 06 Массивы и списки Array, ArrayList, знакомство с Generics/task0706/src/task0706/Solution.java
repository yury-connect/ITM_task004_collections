package task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."

Примечание:
дом с порядковым номером 0 считать четным.


Requirements:
1. Программа должна создавать массив на 15 целых чисел.
2. Программа должна считывать числа для массива с клавиатуры.
3. Программа должна вывести сообщение "В домах с нечетными номерами проживает больше жителей.", если сумма нечетных элементов массива больше суммы четных.
4. Программа должна вывести сообщение "В домах с четными номерами проживает больше жителей.", если сумма четных элементов массива больше суммы нечетных.
5. Программа не должна выводить текст в консоль, если количество жителей на каждой стороне - одинаковое.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int size = 15;
        System.out.printf("\nСоздан массив из '%d' элементов. \nЗаполним его элементы.\n", size);
        int[] houses = new int[size];
        for(int i = 0; i < size ; i++) {
            System.out.printf("\nВведите число жителей дома № '%d' из '%d' : ", i + 1, size);
            houses[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println("Введены следующие значения:");
        boolean transfer = true;
        for (int i = 0; i < size; i += 2) {
            System.out.print("\t\t\tдом № " + i + ",\tжителей = " + houses[i]);
            if (transfer = !transfer) {
                System.out.println();
            }
        }

        int even = 0;
        int notEven = 0;
        for (int house: houses) {
            if (house % 2== 0) {
                even++;
            } else {
                notEven++;
            }
        }
        System.out.println("не четных = " + notEven + ",\t\t четных = " + even);

        if (even > notEven) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else if (even < notEven) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
