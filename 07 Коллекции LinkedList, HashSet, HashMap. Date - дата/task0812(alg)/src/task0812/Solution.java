package task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Cамая длинная последовательность
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.


Requirements:
1. Программа должна выводить число на экран.
2. Программа должна считывать значения с клавиатуры.
3. В методе main объяви переменную типа List с типом элементов Integer и сразу проинициализируй ee.
4. Программа должна добавлять в коллекцию 10 чисел, согласно условию.
5. Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final int size = 10;
        List<Integer> integerList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            Integer current = Integer.parseInt(reader.readLine());
            integerList.add(current);
        }

//        integerList.add(1); integerList.add(0); integerList.add(3); integerList.add(0); integerList.add(3); integerList.add(3); integerList.add(1); integerList.add(1); integerList.add(1); integerList.add(9);   // Для тестирования, результат будет 3


        Integer previous = integerList.get(0);
        int maxLength = 1;
        int countCurrent = 0;
        for (Integer item: integerList) {
            if (item.equals(previous)) {
                countCurrent++;
            } else {
                countCurrent = 1;
            }
            maxLength = Math.max(maxLength, countCurrent);
            previous = item;
        }
        System.out.println(maxLength);
    }
}
