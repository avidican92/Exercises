package com.fasttrackit;

import java.util.Scanner;

public class ReadAndDisplay {
    public static void main(String[] args) {
        System.out.println("Introdu lugimea N");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Introdu " + n + " numere");
        int sirNumere[] = new int[n];

        for (int i = 0; i < n; i++) {
            sirNumere[i] = in.nextInt();
        }
        System.out.println("Ai introdus");
        for (int i = 0; i < sirNumere.length; i++){
            System.out.println(sirNumere[i]);
        }

    }
}
