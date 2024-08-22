package com.number_and_loops;
import java.util.Scanner;
// Common factors of given 2 numbers
public class Lab10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();

        commonFactors(n1,n2);
    }
    private static void commonFactors(int n1, int n2) {
        for(int i=1;(i<=n1&&i<=n2);i++){
            if(n1%i==0 && n2%i==0){
                System.out.println(i);
            }
        }
    }
}
