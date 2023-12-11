package com.Arrays;
import java.util.Scanner;
public class Lab14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int []ar = new int[size];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        for(int i=0; i<ar.length;i++) {
            System.out.print(ar[i]+ " ");
        }
    }
}
