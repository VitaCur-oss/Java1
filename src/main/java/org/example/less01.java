package org.example;

import java.util.Arrays;
import java.util.Random;

public class less01 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer rr1 = random.nextInt(10000);
        System.out.println(rr1);
        String[] srr1 = rr1.toString().split("");

        for (int i = srr1.length - 1; i >= 0 ; i--) {
            System.out.print(srr1[i]);
        }
        String fio = "Шиловский Антон Евгеньевич";
        String[] fioarr = fio.split(" ");
        System.out.println();
        System.out.println(fioarr[0] + ' ' + fioarr[1].charAt(0) + '.' + fioarr[2].charAt(0) + '.');

        Integer i = new Random().nextInt(2000);
        System.out.println(i);
        String n = Integer.toBinaryString(i);
        System.out.println(n);
        System.out.println(n.length());
        Integer n1 = Integer.valueOf(n.length());
        System.out.println(n1);

        int len1 = 0;
        for (int j = 0; j < Short.MAX_VALUE; j++) {
            if (j % n1 == 0) {
                len1++;
            }
        }
        System.out.println(len1);
        Integer[] m1 = new Integer[len1];
        m1[0] = 0;
        for (int j = 1; j < len1; j++) {
            m1[j] = m1[0] += n1;

        }
        System.out.println(Arrays.toString(m1));




        }






    }

