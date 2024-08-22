package interview.Test;

public class OddCountOfSubArrays {
    public static void main(String[] args) {

        int[] ar = {1, 1, 1, 2, 3};

        int k=3;
       int x= countOddSubArrays(ar,k);
        System.out.println(x);
    }

    private static int countOddSubArrays(int[] ar,int k) {
        int count=0;
        int oddCount=0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i; j < ar.length; j++) {
                if (ar[j] % 2 != 0) {
                    oddCount++;
                }

               if(oddCount==k){
                   count++;
               }
            }
        }
        return count;
    }
}