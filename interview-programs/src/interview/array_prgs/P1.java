package interview.array_prgs;
// sorting array in ascending order
import java.util.Arrays;

public class P1 {
    public static void main(String[] args) {

        int[] array = {5, 3, 8, 1, 2, 7, 4, 6};

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        Arrays.sort(array);
        System.out.println();

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}