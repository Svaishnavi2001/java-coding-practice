package com.alphabets_pattern;
/*
        A
        C B
        D E F
        J I H G
        K L M N O
 */
public class Pat4 {

    public static void main(String[] args) {

        char ch='A';
        for(int i=1;i<=5;i++){
            if(i%2==0){
                char chrev=(char)(ch+i-1);
                for(int j=1;j<=i;j++){
                    System.out.print(chrev-- +" ");
                }
            }
            else{
                for(int j=1;j<=i;j++){
                    System.out.print(ch++ +" ");
                }
            }
            System.out.println();
        }
    }
}
