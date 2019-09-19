package com.fasttrackit;

import java.util.Scanner;

public class ten {
    // Product of the first n elements
    public static void main(String[] args) {
        System.out.println("Introdu un numar: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int product = 1;
        for (int i = 1; i <= n; i++){
            product = product * i;
        }
        System.out.println(product);
    }
}
