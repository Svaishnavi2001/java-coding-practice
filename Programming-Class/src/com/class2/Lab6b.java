package com.class2;
import java.util.Scanner;
// Whether the given number is Prime or not.
public class Lab6b {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();

        String res=countFactors(n);
        System.out.println(res);
    }
    private static String countFactors(int n){
        int count=0;
        if(count==1){
            return "Not Prime";
        }
        for(int i=2;i<=n-1;i++) {
            if (n % i == 0) {
                return "Not Prime";
            }
        }
            return "Prime";

    }
}
