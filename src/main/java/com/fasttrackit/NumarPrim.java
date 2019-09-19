package com.fasttrackit;

import java.util.Scanner;

public class NumarPrim {
    public static void main(String[] args) {
        System.out.println("Dati un numar");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i < n; i++){
            boolean isPrim = true;
            for (int j = 2; j < i; j ++){
                if (i % j == 0){
                    isPrim = false;
                }

            }
            if (isPrim){
                System.out.println("Numar prim " + i);
            }

        }

    }
}
