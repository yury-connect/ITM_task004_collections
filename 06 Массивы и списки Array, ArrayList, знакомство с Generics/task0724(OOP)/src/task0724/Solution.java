package task0724;

/* 
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось:
Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...


Requirements:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.*/

public class Solution {
    public static void main(String[] args) {
        Human grandfatherDad = new Human("Амвросий (дедушка отца)", true, 95); // (String name, boolean sex, int age)
        Human grandmotherDad = new Human("Василиса (бабушка отца)", false, 90); // (String name, boolean sex, int age)
        Human grandfatherMom = new Human("Ибрагим (дедушка матери)", false, 87); // (String name, boolean sex, int age)
        Human grandmotherMom = new Human("Дарья (бабушка матери)", true, 80); // (String name, boolean sex, int age)
        Human dad = new Human("Иван (отец)", true, 60, grandfatherDad, grandmotherDad); // (String name, boolean sex, int age, Human father, Human mother)
        Human mom = new Human("Светлана (мать)", false, 55, grandfatherMom, grandmotherMom); // (String name, boolean sex, int age, Human father, Human mother)
        Human child1 = new Human("Андрей (сын старший)", true, 30, dad, mom); // (String name, boolean sex, int age, Human father, Human mother)
        Human child2 = new Human("Игорь (сын младший)", true, 19, dad, mom); // (String name, boolean sex, int age, Human father, Human mother)
        Human child3 = new Human("Наталья (дочь)", false, 17, dad, mom); // (String name, boolean sex, int age, Human father, Human mother)

        System.out.println(grandfatherDad);
        System.out.println(grandmotherDad);
        System.out.println(grandfatherMom);
        System.out.println(grandmotherMom);
        System.out.println(dad);
        System.out.println(mom);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex; // true - "мужской", false "женский"
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this(name, sex, age, null, null);
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();
            result.append("Имя: " + this.name);
            result.append(", пол: " + (this.sex ? "мужской" : "женский"));
            result.append(", возраст: " + this.age);

            if (this.father != null) {
                result.append(", отец: " + this.father.name);
            }

            if (this.mother != null) {
                result.append(", мать: " + this.mother.name);
            }

            /* Приведенный в задании код заменен кодом выше. Исходный код ниже закомментирован.
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }
            return text;
            */
            return result.toString();
        }
    }
}