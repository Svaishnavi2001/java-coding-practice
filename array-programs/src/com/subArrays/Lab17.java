package com.subArrays;
import java.util.Scanner;
// Print all subArrays that are consecutive
public class Lab17 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int []ar=new int[size];

        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        printConsecutive(ar);
    }
    private static void printConsecutive(int[] ar) {
        for(int i=0;i<ar.length-1;i++) {

            if (ar[i + 1] - ar[i] == 1) {
                System.out.print(ar[i]);
            } else {
                System.out.print(ar[i] + " ");
            }
         }
            System.out.println(ar[ar.length-1]+" ");
        }

    }

