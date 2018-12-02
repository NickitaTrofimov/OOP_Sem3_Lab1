package com.company;

import java.lang.System;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int s = 0, i, N;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size array: ");
        N = in.nextInt();
        int [] b = new int[N];

        for(i = 0; i < N; i++){
            b[i] = in.nextInt();
        }

        System.out.println("Array: ");
        for(i = 0; i < N; i++){
            System.out.println("Array[" + i + "] = " + b[i]);
        }

        for (i = 0; i < N; i++){
            b[i] = (int) (Math.random()*1000 - Math.random()*1000);
        }

        System.out.println("Array: ");
        for(i = 0; i < N; i++){
            System.out.println("Array[" + i + "] = " + b[i]);
        }

        for (i = 0; i < N; i++)
            for (int j = 0; j < N - 1; j++) {
                int m;
                if (b[j] > b[j + 1]) {
                    m = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = m;
                }
            }

        System.out.println("Sorted array:");
        for ( i = 0; i < N; i++){
            System.out.println("Array[" + i + "] = " + b[i]);
        }


        for (i = 0; i < N; i++){
            s = s + b[i];
        }

        System.out.println("Result: " + s);

        Random random = new Random(1000);
        for (i = 0; i < N; i++) {
            b[i] = random.nextInt(5);
        }

        System.out.println("Array: ");
        for(i = 0; i < N; i++){
            System.out.println("Array[" + i + "] = " + b[i]);
        }

        for (i = 0; i < N; i++)
            for (int j = 0; j < N - 1; j++) {
                int m;
                if (b[j] > b[j + 1]) {
                    m = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = m;
                }
            }

        System.out.println("Sorted array:");
        for ( i = 0; i < N; i++){
            System.out.println("Array[" + i + "] = " + b[i]);
        }
    }
}
