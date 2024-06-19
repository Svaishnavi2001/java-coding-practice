package com.stars_pattern_prg;
/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */
public class Pat8 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int k=1;k<=5-i+1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //---------------
        for (int i=2;i<=5; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j=1;j<=2*(5-i+1)-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    *****
     *****
      *****
       *****
        *****
     */
    public static class Pat9 {
        public static void main(String[] args) {
            for(int i=1;i<=5;i++){
                for(int k=1;k<=i;k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=5;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    /*
        *****
       *****
      *****
     *****
    *****
     */
    public static class Pat10 {
        public static void main(String[] args) {
            for(int i=1;i<=5;i++){
                for(int k=1;k<=5-i+1;k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=5;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static class Pat3 {

        public static void main(String[] args) {


        }
    }
}

