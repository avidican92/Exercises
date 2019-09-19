package com.fasttrackit;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        //Suma primelor n numere naturale
        System.out.println("Introduceti un numar:");
        Scanner in= new Scanner(System.in);
        int sum = 0;
        int n=in.nextInt();
        for(int i = 1;i <= n;i++)
        {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
