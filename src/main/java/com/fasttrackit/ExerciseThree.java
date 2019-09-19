package com.fasttrackit;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String args[]) {
        //Adunare numere pare
        System.out.println("Introdu un numar:");
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Suma numerelor pare pana la " + n + " este: " + sum);


        //Adunare numere impare
        System.out.println("Introdu un numar:");
        Scanner out = new Scanner(System.in);
        int sum2 = 0;
        int n2 = in.nextInt();
        for (int y = 1; y <= n2; y++) {
            if (y % 2 != 0) {
                sum2 = sum2 + y;
            }
        }
        System.out.println("Suma numerelor pare pana la " + n2 + " este: " + sum2);
    }
}

