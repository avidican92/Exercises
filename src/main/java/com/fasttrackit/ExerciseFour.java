package com.fasttrackit;

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        //Suma numerelor patrate
        System.out.println("Introduceti un numar:");
        Scanner in= new Scanner(System.in);
        int sum = 0;
        int n=in.nextInt();
        for(int i = 1;i <= n;i++)
        {
            sum +=(i*i);
        }
        System.out.println(sum);


    //Suma numerelor patrate
        System.out.println("Introduceti un numar:");
    Scanner out= new Scanner(System.in);
    int sum2 = 0;
    int n2=out.nextInt();
        for(int y = 1;y <= n2;y++)
    {
        sum2 +=(y*y*y);
    }
        System.out.println(sum2);
}
}
