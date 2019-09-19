package com.fasttrackit;

import java.util.Scanner;

public class sixteen {
    //If a > b show the different, if a < b, do the sum.
    public static void main(String[] args) {
        System.out.println("Introdu primul numar");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Introdu al doilea numar");
        int b = in.nextInt();
        int result;
        if (a > b){
            result = a - b;
            System.out.println("Diferenta dintre primul si al doilea numar este: " + result);
        } if (a < b){
            result = a + b;
            System.out.println("Suma dintre primul si al doilea numar este: " + result);
        }
    }
}
