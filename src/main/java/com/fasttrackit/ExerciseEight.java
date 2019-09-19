package com.fasttrackit;

import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        //Calculates the arithmetic mean
        System.out.println("Introduceti un numar");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Intoduceti " + n + " numere:");
        int[] sirNumere = new int[n];
        int result= 0;
        double finalResult;
        for(int i =0; i < n; i++){
            sirNumere[i] = in.nextInt();
        }

        for(int i =0; i < sirNumere.length; i++){
            result += sirNumere[i];
        }

        finalResult = result / n;

        System.out.println("Media aritmetica a numerelor introduse este: " + finalResult);
    }
}
