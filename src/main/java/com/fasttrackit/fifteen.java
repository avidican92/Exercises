package com.fasttrackit;

import java.util.Scanner;

public class fifteen {
    //Display if a number is divisble with 5 or 7
    public static void main(String[] args) {
        System.out.println("Introdu un numar");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n % 5 == 0){
            System.out.println("Numarul introdus este divisibil cu 5.");
        } else {
            if (n % 7 == 0) {
                System.out.println("Numarul introdus este divizibil cu 7.");
            } else {
                System.out.println("Numarul introdus nu este divizibil cu 5 sau 7.");
            }
        }
    }
}
