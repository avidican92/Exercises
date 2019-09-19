package com.fasttrackit;

import java.util.Scanner;

public class thirteen {
    // Median of the sum and product of the numbers
    public static void main(String[] args) {
        System.out.println("Introdu un numar");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sirNumere[]= new int[n];
        int sum = 0;
        int product = 1;
        int median;
        System.out.println("Introdu " + n + " numere.");
        for (int i = 0; i < n; i++){
            sirNumere[i] = in.nextInt();
        }

        for (int i = 0; i < sirNumere.length; i++){
            sum += sirNumere[i];
        }

        for (int i =0; i < sirNumere.length; i++){
            product *= sirNumere[i];
        }
        median = (sum + product) / 2;
        System.out.println("Media aritmetica intre suma si produsul numerelor introduse este: " + median);

    }
}
