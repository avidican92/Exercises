package com.fasttrackit;

import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {
        System.out.println("Introdu un numar");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] sirNumere = new int[n];
        System.out.println("Introdu " + n + " numere.");
        for (int i = 0; i < n; i++){
            sirNumere[i] = in.nextInt();
        }

        int j = 0;

        while (j<n &&sirNumere[j] != 0){
            j++;
        }

        if (j==n){
            System.out.println("Nu exista nici un 0");
        } else {
            System.out.println("Primul numar 0 este pe pozitia: " + j);
        }

    }
}
