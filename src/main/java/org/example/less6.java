package org.example;

import java.util.*;

public class less6 {
    public static void main(String[] args) {
        mySet me = new mySet();
        mytreeSet mytreeSet = new mytreeSet();
        me.add(7);
        me.add(5);
        me.add(4);
        me.add(8);
        for (int i = 0; i < 5; i++) {
            me.add(new Random().nextInt(15));
        }
        for (int i = 0; i < 5; i++) {
            mytreeSet.add(new Random().nextInt(15));
        }
        System.out.println(me.contains(7));
        System.out.println(Arrays.toString(me.toArray()));
        Iterator<Integer> iterator = mytreeSet.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();
        System.out.println(me.getItem(3));

        System.out.println(mytreeSet);
    }
}
class mySet {
   private ArrayList<Integer> list = new ArrayList<>();

//   public boolean add(int num){
//       if (!list.contains(num)){
//           list.add(num);
//           return true;
//       }
//       return false;
//   }
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
class mytreeSet {
    private Comparator<Integer> comparator;
    public mytreeSet(){
        comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
    }
    private ArrayList<Integer> list = new ArrayList<>();

    //   public boolean add(int num){
//       if (!list.contains(num)){
//           list.add(num);
//           return true;
//       }
//       return false;
//   }
    private TreeMap<Integer, Object> treeMap = new TreeMap<>(comparator);
    static final Object OBJECT = new Object();
    public boolean add(int num){
        // HashSet<Integer> integers;
        return treeMap.put(num, OBJECT) == null;
    }

    public boolean contains(int num){
        return treeMap.containsKey(num);
    }

    public Object[] toArray (){
        return treeMap.keySet().toArray();
    }

    public Iterator<Integer> iterator(){
        return treeMap.keySet().iterator();
    }

    public Integer getItem (int index){
        return (Integer) toArray()[index];
    }
}

