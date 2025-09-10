package com.arrays;
import java.util.Scanner;
// Print pairs whose difference=k
public class Lab25a {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int []ar=new int [size];

        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        int k=scan.nextInt();

        printPairs(ar,k);
}
    private static void printPairs(int[] ar, int k) {
       
        for(int i=0;i<ar.length-1;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]-ar[j]==k || ar[j]-ar[i]==k){
                    System.out.println(ar[i]+" "+ar[j]);
                   
                }
            }
        }
    }
}
