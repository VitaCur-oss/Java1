package org.example;

import java.util.HashMap;

public class home5 {
    public static void main(String[] args) {
        //Создать множество, ключь и значение строки. Добавить шесть элементов.
        // Вывести в консоль значения. Добавить ко всем значениям символ "!".

        HashMap<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "fri");
        map.put("4", "four");
        map.put("5", "five");
        map.put("6", "six");

        System.out.println(map);

        for (String key: map.keySet()) {
            map.compute(key, (k, v) -> v+"!");
        }
        System.out.println(map);

        //Создать второе множество с таким же обобщением.
        // Ключи второго множества частично совпадают с ключеми первого.

        HashMap<String, String> map1 = new HashMap<>();
        map1.put("1", "one");
        map1.put("7", "seven");
        map1.put("3", "fri");
        map1.put("8", "eight");
        map1.put("5", "five");
        map1.put("9", "nine");
        System.out.println(map1);

        //Объеденить значания во втором множестве и первом если ключи совподают.
        // Вывести результат в консоль.

        HashMap<String, String> mapAll = new HashMap<>();
        mapAll.putAll(map);
        mapAll.putAll(map1);
        System.out.println(mapAll);

    }
}
