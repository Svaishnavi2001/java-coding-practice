package interview.array_prgs;
// sorting array in ascending order
import java.util.Arrays;

public class SortingOfArray {
    public static void main(String[] args) {

        int[] ar = {5, 3, 8, 1, 2, 7, 4, 6};

        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }

        Arrays.sort(ar);
        System.out.println();

        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }

    }
}