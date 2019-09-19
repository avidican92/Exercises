package com.fasttrackit;

import java.util.Scanner;

public class SumaCelorDouaSiruri {
    public static void main(String[] args) {
        System.out.println("Introdu lungimea N");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] sirNumereN = new int[n];
        int[] sirNumereM = new int[n];

        System.out.println("Introdu " + n + " numere pentru primul sir:");
        for (int i = 0; i < n; i++){
            sirNumereN[i] = in.nextInt();
        }

        System.out.println("Introdu " + n + " numere pentru al doilea sir:");
        for (int i = 0; i < n; i++){
            sirNumereM[i] = in.nextInt();
        }

        int[] sume = new int[n];
        for (int i = 0; i < sirNumereN.length; i++){
                sume[i] = sirNumereN[i] + sirNumereM[i];
        }

        for (int i = 0; i < n; i++){
            System.out.println("Suma numerelor din elementul " + i + " este " + sume[i]);
        }
    }
}
