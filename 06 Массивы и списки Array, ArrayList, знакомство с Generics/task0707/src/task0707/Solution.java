package task0707;

import java.util.ArrayList;
import java.util.List;

/* 
Что за список такой?
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.


Requirements:
1. Программа не должна ничего считывать с клавиатуры.
2. Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
3. Программа должна добавить 5 любых строк в список.
4. Программа должна вывести размер списка на экран.
5. Программа должна вывести содержимое списка на экран, каждое значение с новой строки.*/

public class Solution {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Привет");
        list.add(" мир");
        list.add("!");
        list.add("Hello");
        list.add("World!");
        System.out.println("Размер списка = " + list.size());
        for (String str: list) {
            System.out.println(str);
        }
    }
}
