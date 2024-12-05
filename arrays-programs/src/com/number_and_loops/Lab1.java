package com.number_and_loops;
import java.util.Scanner;
// Even numbers from 1 to n.
public class Lab1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
