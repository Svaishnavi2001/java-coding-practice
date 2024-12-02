package interview.arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromNonSortedArray {
    public static void main(String[] args) {

        int ar[]={1,2,3,4,3,3,2,5,6,7,6,8,9};

        Set<Integer> set = new LinkedHashSet<>();

        for(int num:ar) {
            set.add(num);
        }

        int temp[]=new int[set.size()];
        int j=0;

        for(int num:set){
            temp[j]=num;
            j++;
        }
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }


    }
}
