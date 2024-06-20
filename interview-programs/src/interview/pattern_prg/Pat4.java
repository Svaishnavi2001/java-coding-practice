package interview.pattern_prg;
/*
     1 2 3 4 5 6
      2 3 4 5 6
       3 4 5 6
        4 5 6
         5 6
          6

 */

public class Pat4 {

    public static void main(String[] args) {


        for(int i=1;i<=6;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            int count=i;
            for(int j=6;j>=i;j--){
                System.out.print(count++ +" ");
            }
            System.out.println();

        }
    }
}
