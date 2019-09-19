package com.fasttrackit;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        System.out.println("Introdu un numar:");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();

        if (n >= 2){
            int[] sirNumere = new int[n];

            System.out.println("Introdu " + n + " numere ");
            for (int i= 0; i < n; i++) {
                sirNumere[i] = in.nextInt();
            }

            int max = sirNumere[0];
            int min = sirNumere[0];
            for (int i = 1; i < sirNumere.length; i++){
                if (max < sirNumere[i]){
                    max = sirNumere[i];
                } if (min > sirNumere[i]){
                    min = sirNumere[i];
                }

            }




            System.out.println("Cel mai mare numar din sir este: " + max + ", iar cel mai mic este: " + min);

        } else {
            System.out.println("Numarul trebuie sa fie minim 2, ai introdus: " + n + ".");
        }




    }
    }

