package com.numbers_pattern_prg;
/*
          1 2 3 4 5
          2     5
          3   5
          4 5
          5
*/

public class Pat12 {
    public static void main(String[] args) {

        int count;
        for(int i=1;i<=5;i++){
            count=i;
            for(int j=1;j<=5-i+1;j++){
                if(i==1||j==1||j==(5-i+1)){
                    System.out.print(count++ +" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
