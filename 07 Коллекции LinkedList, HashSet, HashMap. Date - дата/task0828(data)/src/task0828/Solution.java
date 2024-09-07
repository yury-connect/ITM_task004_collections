package task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используй коллекции.


Requirements:
1. Программа должна считывать одно значение с клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна использовать коллекции.
4. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" Вывожу все возможные месяцы года // варианты ввода:");
        Map<String, Integer> months = generateMonths();
        months.entrySet().stream().forEach(entry -> System.out.printf("%-15s (месяц № %d)\n", entry.getKey(), entry.getValue()));
        System.out.println("\n Введите название месяца из предложенных вариантов: ");
        String month = reader.readLine().toLowerCase().trim();
        System.out.printf("%s is the %d month.", month, months.get(month));
    }

    private static Map<String, Integer> generateMonths() {
        Map<String, Integer> result = new HashMap<>(12);
        result.put("january", 1);
        result.put("february", 2);
        result.put("march", 3);
        result.put("april", 4);
        result.put("may", 5);
        result.put("june", 6);
        result.put("july", 7);
        result.put("august", 8);
        result.put("september", 9);
        result.put("october", 10);
        result.put("november", 11);
        result.put("december", 12);
        return result;
    }
}
