package interview.arrays;

import java.util.Scanner;

public class LargeAndSmallInSingleIteration {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int ar[]=new int[s];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
         for(int i=0;i<ar.length;i++){
             if(ar[i]>max){
                 max=ar[i];
             }
             if(ar[i]<min){
                 min=ar[i];
             }
         }
        System.out.println(max);
        System.out.println(min);
    }
}
