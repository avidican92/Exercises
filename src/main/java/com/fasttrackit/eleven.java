package com.fasttrackit;

import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
        // Add zero to the end of each number
        System.out.println("Introdu un numar");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sirNumere[] = new int[n];
        System.out.println("Introdu " + n + " numere:");
        for (int i = 0; i < n; i++){
            sirNumere[i]= in.nextInt();
        }

        for (int i = 0; i < sirNumere.length; i++){
            System.out.println(sirNumere[i] * 10);
        }
    }
}
