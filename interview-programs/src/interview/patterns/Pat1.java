package interview.patterns;
/*
           0
          0 1
         0 1 2
        0 1 2 3
       0 1 2 3 4
      0 1 2 3 4 5
*/
public class Pat1 {
    public static void main(String[] args) {

        for(int i=0;i<=5;i++){
            for(int k=0;k<=5-i+1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){


                    System.out.print(j+" ");
                }
            System.out.println();
        }

    }
}
