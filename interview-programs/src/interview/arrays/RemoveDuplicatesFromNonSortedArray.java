package interview.arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromNonSortedArray {
    public static void main(String[] args) {

        int ar[]={1,2,3,3,4,5,4,4,6,7,6};

        int res[]=removeDuplicates(ar);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    private static int[]  removeDuplicates(int ar[]){

        Set<Integer> set=new HashSet<>();
        for(int num:ar){
            set.add(num);
        }

        int temp[]=new int[set.size()];
        int j=0;

        for(int num:set){
            temp[j]=num;
            j++;
        }

        return temp;
    }
}
