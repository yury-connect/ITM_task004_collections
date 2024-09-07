package task0827;

import java.util.Date;

/* 
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудь учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false


Requirements:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date dateNeed = new Date(date);
        Date startOfYear = new Date(dateNeed.getYear(), 0, 1);

        // Вычисляем количество миллисекунд между нужной датой и 1 января рассматриваемого года
        long millisecondsSinceStartOfYear = dateNeed.getTime() - startOfYear.getTime();

        // Переводим миллисекунды в дни
        long daysSinceStartOfYear = millisecondsSinceStartOfYear / (1000 * 60 * 60 * 24);

        System.out.println("Количество дней, прошедшее с начала года: " + daysSinceStartOfYear);

        return daysSinceStartOfYear % 2 != 0;   // 'true' - если не четное, 'false' - если чет.
    }
}
