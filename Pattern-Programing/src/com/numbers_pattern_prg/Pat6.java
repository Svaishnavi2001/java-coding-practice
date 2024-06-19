package com.numbers_pattern_prg;
/*
1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
 */
public class Pat6 {
    public static void main(String[] args) {
        int count;
        for(int i=1;i<=5;i++){
            count=i;
            for(int j=1;j<=5;j++){
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
}
