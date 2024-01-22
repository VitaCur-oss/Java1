package org.example;

import java.util.*;

public class homework_3 {
    public static void main(String[] args) {
//        Реализовать алгоритм обратной сортировки списков компаратором.
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(7);
        System.out.println(list);
        list2.addAll(list);
        list.sort(Comparator.reverseOrder());

        System.out.println(list);

//        Пусть дан произвольный список целых чисел, удалить из него чётные числа

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) list.remove(list.get(i));
        }
        System.out.println(list);

//        Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

        Integer max_num = Collections.max(list);
        Integer min_num = Collections.min(list);
        Integer average_num = (int) list.stream().mapToInt(i -> i).average().orElse(0);

        System.out.println(max_num);
        System.out.println(min_num);
        System.out.println(average_num);

        // Дано два целочисленных списка, объеденить их не допуская элементы
        // второго списка уже встречающиеся в первом.
        list.add(15);
        System.out.println(list2);
       // list2.addAll(list);
        for (int i = 0; i < list.size(); i++) {
            if (list2.contains(list.get(i))) continue;
            else list2.add(list.get(i));
        }
        System.out.println(list);

        System.out.println(list2);

        //Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
        Integer start = (int) System.currentTimeMillis();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            integers.add(0,0);
        }
        System.out.println(integers);
        Integer end = (int) System.currentTimeMillis();

       // Повторить пятый пункт но с LinkedList.
        Integer start1 = (int) System.currentTimeMillis();
        LinkedList<Integer> integers1 = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            integers1.add(0,0);
        }
        System.out.println(integers1);
        Integer end1 = (int) System.currentTimeMillis();
        //Сравнить время работы пятого и шестого пунктов.

        System.out.println((end - start) + " mc");
        System.out.println((end1 - start1) + " mc");
    }
}
