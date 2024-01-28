package interview.arrays;

import java.util.Scanner;

public class Prg2 {
    public static void main(String[] args) {
        //int []arr={10,20,30,40,50};
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int[] ar = new int[s];
        int min=0;
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
            min= ar[i];

        }
        System.out.println("min value: "+ min);
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] <= min) {
                min = ar[i];
                System.out.println(min);
            }
        }
    }
    }

