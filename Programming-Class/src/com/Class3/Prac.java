package com.Class3;

import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int s1=sc.nextInt();
        int[] ar1=new int[s1];
        for(int i=0;i<ar1.length;i++){
            ar1[i]=sc.nextInt();
        }

        int s2=sc.nextInt();
        int[] ar2=new int[s2];
        for(int j=0;j<ar2.length;j++){
            ar2[j]=sc.nextInt();
        }

        duplicateElem(ar1,ar2);
    }

    private static void duplicateElem(int[] ar1, int[] ar2) {
        int i=0,j=0;

        while(i<ar1.length && j<ar2.length){
            if(ar1[i]==ar2[j]){
                System.out.println(ar1[i]);
                i++;
                j++;
            }
            else if(ar1[i]<ar2[j]){
                j++;
            }
            else {
                i++;
            }
        }


    }
}
