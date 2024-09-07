package task0815;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.*/

/*
    Задача с тупым условием. Все ключи уникальные,
    значит фамилии будут пере-затираться и всегда количество совпадающих фамилий будет = 1   !!!
 */
public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> people = new HashMap<>();   // <"Фамилия", "Имя">
        people.put("Иванов", "Дмитрий");
        people.put("Иванов", "Петр");
        people.put("Иванов", "Иван");
        people.put("Петров", "Михаил");
        people.put("Петров", "Петр");
        people.put("Петров", "Иван");
        people.put("Федотов", "Дмитрий");
        people.put("Федотов", "Тарас");
        people.put("Федотов", "Иван");
        people.put("Петросян", "Евгений");
        return people;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        List<String> list = map.values().stream().toList();
        return counting(list, name);
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        List<String> list = map.keySet().stream().toList();
        return counting(list, lastName); // Метод всегда будет возвращать '1' т.к. ключи (т.е. фамилии) все уникальные!!!
    }

    public static void main(String[] args) {
        Map<String, String> people = createMap();
        people.entrySet().stream().forEach(entry -> System.out.printf("Фамилия: %-15s,\t Имя: %-15s\n", entry.getKey(), entry.getValue()));
        System.out.println("FirstName 'Иван' повторяется: " + getCountTheSameFirstName(people, "Иван") + " раз.");
        System.out.println("LastName 'Иванов' повторяется: " + getCountTheSameLastName(people, "Иванов") + " раз.");
    }

    private static int counting(List<String> stringList, String str) {
        int count = 0;
        for (String item: stringList) {
            if (item.equals(str)) {
                count++;
            }
        }
        return count;
    }
}
