package interview.array_prgs;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {

        int []arr={1,2,2,3,1,2,3,4,7};
        int[]temp=new int[arr.length];
        int j=0;

        for(int i=0;i<arr.length-1;i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
            }
        }
            temp[j] = arr[arr.length - 1];
            j++;

        for(int k=0;k<j;k++){
            System.out.print(temp[k]+" ");
        }

        Set<Integer> integerSet=new HashSet<>();
        for(int i:arr){
            integerSet.add(i);
        }

        System.out.println("\n" +integerSet);

    }
}
