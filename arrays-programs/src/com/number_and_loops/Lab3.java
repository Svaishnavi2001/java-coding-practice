package com.number_and_loops;
import java.util.Scanner;
/* Print the following:
   5x1=5
   5x2=10
   5x3=15
   ....
   5x10=50
*/
public class Lab3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+(n*i));
        }
    }
}
