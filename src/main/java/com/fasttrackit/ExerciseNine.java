package com.fasttrackit;

import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {
        System.out.println("Introdu primul numar");
        Scanner in= new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Introdu al doilea numar");
        int b = in.nextInt();
        int sum = a + b;
        int product = a * b;
        int median = (a + b) / 2;

        System.out.println("Suma numerelor este: " + sum);
        System.out.println("Produsul numerelor este: " + product);
        System.out.println("Media aritmetica a numerelor este: " + median);

    }
}
