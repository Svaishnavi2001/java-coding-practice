package com.numbers_pattern_prg;
/*
      1 2 3 4 5
      2 3 4 5
      3 4 5
      4 5
      5

 */
public class Pat11 {
    public static void main(String[] args) {

        int count;
        for(int i=1;i<=5;i++){
            count=i;
            for(int j=1;j<=5-i+1;j++){
                System.out.print(count++ +" ");
            }
            System.out.println();
        }


    }
}
