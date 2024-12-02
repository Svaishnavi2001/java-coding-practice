package interview.arrays;
// Union of 2 Arrays(non duplicate elements)
import java.util.LinkedHashSet;
import java.util.Set;

public class UnionOfTwoArrays {
    public static void main(String[] args) {

        int []ar1={1,2,3,4,5};
        int []ar2={3,4,5,6,7};

        Set<Integer> set=new LinkedHashSet<>();
        for(int num: ar1){
            set.add(num);
        }

        for(int num: ar2){
            set.add(num);
        }

        int []temp=new int[set.size()];
        int j=0;

        for(int num:set) {
            temp[j] = num;
            j++;
        }

        for (int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
}

