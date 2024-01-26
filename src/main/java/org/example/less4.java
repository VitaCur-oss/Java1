package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class less4 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String in = scanner.nextLine();
//        ArrayList<String> list = new ArrayList<>();
//        while (!in.equals("g")){
//            System.out.println(in);
//            list.add(in);
//            in = scanner.nextLine();
//        }
//
//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                int a = Integer.parseInt(o1.split(" ")[3]);
//                int b = Integer.parseInt(o2.split(" ")[3]);
//                return a - b;
//            }
//        });
//        System.out.println(list);


        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> soname = new ArrayList<>();
        ArrayList<String> name  = new ArrayList<>();
        ArrayList<String> second_name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();
        int i = 0;

        while (!in.equals("g")){

            //System.out.println(in);
            list.add(in);
            soname.add(in.split(" ")[0]);
            name.add(in.split(" ")[1]);
            second_name.add(in.split(" ")[2]);
            age.add(Integer.parseInt(in.split(" ")[3]));
            gender.add(in.split(" ")[4]);
            id.add(i);
            i++;
            in = scanner.nextLine();
        }

        for (int j = 0; j < age.size() - 1; j++) {
            int tem = 0;
            if (age.get(j) <= age.get(j + 1)){
                tem = age.get(j);
                age.set(j, age.get(j + 1));
                age.set((j + 1), tem);
                tem = id.get(j);
                id.set(j, id.get(j + 1));
                id.set((j + 1), tem);
            }
        }
        for (int j: id ) {
            System.out.println(list.get(j));
        }
//        private static void sortIndexesByIntList(ArrayList<Integer> arrayToSort, LinkedList<Integer> ind) {
//            ArrayList<Integer> arr = new ArrayList<>(arrayToSort);
//
//            for (int i = 0; i < arr.size(); i++) {
//                for (int j = 0; j < arr.size() - 1; j++) {
//                    if (arr.get(j) > arr.get(j + 1)) {
//                        int tmp = ind.get(j);
//                        ind.set(j, ind.get(j + 1));
//                        ind.set(j + 1, tmp);
//
//                        tmp = arr.get(j);
//                        arr.set(j, arr.get(j + 1));
//                        arr.set(j + 1, tmp);
//                    }
//                }
//            }
//        }

       // System.out.println(age);


//        System.out.println(soname);
//        System.out.println(name);
//        System.out.println(second_name);
//        System.out.println(age);
//        System.out.println(gender);
//        System.out.println(id);
    }
}
