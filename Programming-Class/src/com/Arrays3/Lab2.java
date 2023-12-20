package com.Arrays3;
import java.util.Scanner;
// Print the unique element of an Array.
public class Lab2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] ar = new int[size];

        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        printUniqueEle(ar);
    }
    private static void printUniqueEle(int[] ar) {
        int count = 1;
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] == ar[i + 1]) {
                count++;
            }
            else {
                if (count == 1) {
                    System.out.println(ar[i]);
                }
                count=1;
            }
        }
            if (count == 1) {
                System.out.println(ar[ar.length - 1]);
            }
        }
    }

