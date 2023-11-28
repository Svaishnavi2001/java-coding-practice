package com.labs;
public class Lab6 {
    public static void main(String[] args) {
        int n=10;
        int count=0;
        for(int i=2;i<=n;i++) {
            if (n % i== 0) {
                count++;

            }
        }
        if(count==0){
            System.out.println(n+"is a Prime ");
        }
        else{
            System.out.println(n+"is not a Prime");
        }
    }

}
