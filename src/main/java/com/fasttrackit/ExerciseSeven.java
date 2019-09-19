package com.fasttrackit;

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        // Find out if a number is or not in an interval
        System.out.println("Introdu un numar intreg");
        Scanner in = new Scanner(System.in);
        int numarIntreg = in.nextInt();
        System.out.println("Introdu limita minima");
        int limitaMinima = in.nextInt();
        System.out.println("Introdu limita maxima");
        int limitaMaxima = in.nextInt();

        if(limitaMinima < limitaMaxima){
            if (numarIntreg >= limitaMinima && numarIntreg <= limitaMaxima){
                System.out.println("Numarul introdus se afla in intervalul mentionat");
            } else {
                System.out.println("Numarul introdus NU se afla in intervalul mentionat");
            }
        } else {
            System.out.println("Limita minima nu poate fi mai mare decat limita maxima! ");
        }

    }
}
