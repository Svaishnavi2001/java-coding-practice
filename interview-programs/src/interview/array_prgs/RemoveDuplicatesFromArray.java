package interview.array_prgs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {

        int []arr={1,2,2,3,1,2,3,4,7};

        // This is only for sorted array
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
        System.out.println();

        // This is for Non-sorted array
        Set<Integer> hs=new HashSet<>();
        for(int i=0;i< arr.length;i++){
            hs.add(arr[i]);
        }
        int []newArray=new int[hs.size()];
        int index=0;

        for(int num:hs) {
            newArray[index] = num;
            index++;
        }
        System.out.println(Arrays.toString(newArray));

    }
}
