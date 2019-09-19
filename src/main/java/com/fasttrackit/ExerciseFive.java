package com.fasttrackit;

import java.util.Scanner;

public class ExerciseFive {

    //Afiseaza cel mai mic numar dintr-un sir.
    public static void main(String[] args) {
        System.out.println("Introdu un numar:");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int smallestNumber=0;
        if (n >= 2){
        int[] sirNumere = new int[n];

        System.out.println("Introdu " + n + " numere ");
         for (int i= 0; i < n; i++) {
             sirNumere[i] = in.nextInt();
         }

         int min = sirNumere[0];

        for (int i = 1; i < sirNumere.length; i++){
            if (min > sirNumere[i]){
                min = sirNumere[i];
            }

         }

            System.out.println("Cel mai mic numar din sir este: " + min);

        } else {
            System.out.println("Numarul trebuie sa fie minim 2, ai introdus: " + n + ".");
        }




    }
}
