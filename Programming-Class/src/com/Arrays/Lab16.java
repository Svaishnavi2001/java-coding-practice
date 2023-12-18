package com.Arrays;
import java.util.Scanner;
// Print odd indexed numbers from Array
public class Lab16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] ar = new int[size];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        for (int i = 0; i < ar.length; i++) {
            if (i % 2 != 0) { // for even indexed-->(i%2==0)

                System.out.print(ar[i] + " ");
            }
        }
      }
    }