package com.fasttrackit;

import java.util.Scanner;

public class fourteen {
    // Display how many numbers are smaller then 5, egual to 5 and bigger then 5.
    public static void main(String[] args) {
        System.out.println("Introdu un numar");
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int sirNumere[] = new int[n];
        int smallerThenFive = 0;
        int egualWithFive = 0;
        int biggerThenFive = 0;
        System.out.println("Introdu " + n + " numere.");
        for (int i =0; i < n; i++){
            sirNumere[i] = in.nextInt();
        }

        for (int i = 0; i < sirNumere.length; i++){
            if (sirNumere[i] < 5){
                smallerThenFive++;
            }
        }
        System.out.println("Ai introdus " + smallerThenFive + " numere mai mici decat 5.");

        for (int i = 0; i < sirNumere.length; i++){
            if (sirNumere[i] == 5){
                egualWithFive++;
            }
        }
        System.out.println("Ai introdus de" + egualWithFive + " ori numarul 5");

        for (int i = 0; i < sirNumere.length; i++){
            if (sirNumere[i] > 5){
                biggerThenFive++;
            }
        }
        System.out.println("Ai introdus " + biggerThenFive + " numere mai mari decat 5.");
    }
}
