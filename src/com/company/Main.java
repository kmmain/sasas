package com.company;
import java.io.PrintStream;
import java.util.Scanner;

public class Main{
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;


    public static void main(String [] args){
        int a, b;
        a = in.nextInt();
        int [] mas = new int [a];
            for(int i = 0; i < mas.length; i++){
                mas[i] = in.nextInt();

            }
        for(int i = 0; i < mas.length; i++){
            if (mas[i] == 0){
                int sas = i;
                for(int k = i; k < mas.length - 1; k++){
                    mas[k] = mas[k+1];

                }
                mas[a-1] = 0;
            }

        }
        for(int i = 0; i < mas.length; i++){
            out.print(mas[i]+ " ");

        }
        }
}


