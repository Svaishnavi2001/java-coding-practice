package com.numbers_pattern_prg;
/*
1
1 2
1   3
1     4
1 2 3 4 5

*/
public class Pat10 {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++){

            for(int j=1;j<=i;j++){
                if(j==1||j==i||i==5){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
