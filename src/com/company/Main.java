package com.company;

import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] mass = new int[]{3, -45, 2, 4, -15, 1, 2, 3, 1, -4, 2, 1, 2, -3, -8};
       

        for (int i = mass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mass[j] > mass[j + 1]) {
                    int tmp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tmp;
                }

                System.out.println(Arrays.toString(mass));
            }

        }


    }

}




















