package interview.arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class UnionOfTwoArrays {
    public static void main(String[] args) {

        int ar1[]={1,2,3,4,5};
        int ar2[]={3,4,5,6,7};

        Set<Integer> set=new LinkedHashSet<>();
        for(int num: ar1){
            set.add(num);
        }

        for(int num: ar2){
            set.add(num);
        }
        System.out.println(set);

        int temp[]=new int[set.size()];
        int k=0;
        for(int num:set) {
            temp[k] = num;
            k++;
        }
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
        }

    }

