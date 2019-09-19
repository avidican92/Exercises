package com.fasttrackit;


import java.util.Scanner;

public class NumberInReverse {
    public static void main(String[] args) {
        System.out.println("Introdu un numar intreg:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cat = 0;
        int invers=0;
        while ( n > 0) {
            int rest = n % 10;
            n = n / 10;
            invers = invers * 10 + rest;
        }
        System.out.println("Inversul numarului este: " + invers);


    }
}
