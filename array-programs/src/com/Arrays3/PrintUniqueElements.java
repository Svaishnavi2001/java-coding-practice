package com.Arrays3;
import java.util.Scanner;
// Print the unique element of an Array.
public class PrintUniqueElements {
    public static void main(String[] args) {

        int []ar={2,2,2,3,4,4,4,23};

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
                    System.out.print(ar[i]+" ");
                }
                count=1;
            }
        }
            if (count == 1) {
                System.out.print(ar[ar.length - 1]+" ");
            }
        }
    }

