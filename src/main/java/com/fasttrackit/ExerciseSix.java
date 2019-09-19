package com.fasttrackit;

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {

        //Display the maximum number
        System.out.println("Introdu 3 numere");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a > b && a > c){
            System.out.println("Cel mai mare numar este: "+ a);
        } else {
            if (b > a && b > c){
                System.out.println("Cel mai mare numar este: "+ b);
            } else {
                System.out.println("Cel mai mare numar este: "+ c);
            }
        }

    }
}
