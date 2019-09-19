package com.fasttrackit;

import java.util.Scanner;

public class ImparSauNu {
        public static void main(String[] args) {
            System.out.println("Introdu un numar");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            if (n % 3 == 0){
                System.out.println("Numarul introdus este impar.");
            } else {
                System.out.println("Numarul introdus nu este impar.");
            }
        }
}
