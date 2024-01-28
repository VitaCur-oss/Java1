package org.example;

import java.util.*;

public class home6 {
    public static void main(String[] args) {
        //Разработать программу, имитирующую поведение коллекции HashSet.
        // В программе содать метод add добавляющий элемент,
        // метод toString возвращающий строку с элементами множества и метод позволяющий
        // читать элементы по индексу.
        //*Реализовать все методы из семинара.
        //Формат данных Integer
    Myhashset myhashset = new Myhashset();
    myhashset.add(15);
        for (int i = 0; i < 10; i++) {
            myhashset.add(new Random().nextInt(15));
        }
        System.out.println(Arrays.toString(myhashset.toArray()));
        System.out.println(myhashset.getItem(3));
    }
}
class Myhashset {
    private ArrayList<Integer> list = new ArrayList<>();

    private LinkedHashMap<Integer, Object> hashMap = new LinkedHashMap<>();
    static final Object OBJECT = new Object();
    public boolean add(int num){
        // HashSet<Integer> integers;
        return hashMap.put(num, OBJECT) == null;
    }

    public boolean contains(int num){
        return hashMap.containsKey(num);
    }

    public Object[] toArray (){
        return hashMap.keySet().toArray();
    }

    public Iterator<Integer> iterator(){
        return hashMap.keySet().iterator();
    }

    public Integer getItem (int index){
        return (Integer) toArray()[index];
    }
}