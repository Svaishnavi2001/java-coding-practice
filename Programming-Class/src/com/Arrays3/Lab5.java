package com.Arrays3;
import java.util.Scanner;
// Print 7*3$2#4$9*5
public class Lab5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int []ar=new int [size];

        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }

        for(int i=0;i<ar.length-1;i++){
            if(ar[i]%2!=0 && ar[i+1]%2!=0){
                System.out.print(ar[i]+"*");
            }
            else if(ar[i]%2==0 && ar[i+1]%2==0){
                System.out.print(ar[i]+"#");
            }
            else if((ar[i]%2==0 && ar[i+1]%2!=0) || (ar[i]%2!=0 && ar[i+1]%2==0)){
                System.out.print(ar[i]+"$");
            }
        }
    }
}
