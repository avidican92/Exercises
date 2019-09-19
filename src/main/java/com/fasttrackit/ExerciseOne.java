package com.fasttrackit;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {

        //Suma primelor 10 numere naturale
        int sum = 0;
        int n=10;
        for(int i = 1;i <= n;i++)
        {
            sum = sum + i;
        }
        System.out.println("Suma primelor 10 numere naturala este: " + sum);


        //Suma primelor 100 de numere naturale

        int sum2 = 0;
        int n2=100;
        for(int i = 1;i <= n2;i++)
        {
            sum2 = sum2 + i;
        }
        System.out.println("Suma primelor 10 numere naturala este: " + sum2);

    }
}
