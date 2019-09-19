package com.fasttrackit;

import java.util.Scanner;

public class twelve {
    public static void main(String[] args) {
        System.out.println("Dati un numar:");
        Scanner in= new Scanner(System.in);
        int n = 0;
        int sum = 0;
        int negativeNumbers = 0;

            do{
                n = in.nextInt();
                if (n >= 0){
                    sum = sum + n;
                } if (n < 0){
                    negativeNumbers++;
                }
            }while (n != 0);
        System.out.println("Suma numerelor pozitive este: " + sum);
        System.out.println("Ai introdus " + negativeNumbers + " numere negative.");



    }
}
