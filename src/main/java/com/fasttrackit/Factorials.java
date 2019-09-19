package com.fasttrackit;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        System.out.println("Introdu numarul N:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++){
            int factorial = 1;
            for (int j = 1; j <= i; j++){
                factorial *= j;
            }
            sum += factorial;
        }
        System.out.println("Suma S = " + sum);
    }
}
