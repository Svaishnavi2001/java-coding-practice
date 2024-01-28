package interview.arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,5,4};
        int arr2[] = {6,8,99};
        mergeArrays(arr1,arr2);
    }

    private static void mergeArrays(int[] ar1, int[] ar2) {
        int k=0;
        int res[]=new int [ar1.length + ar2.length];

        for(int i=0;i<ar1.length;i++){
            res[k] = ar1[i];
            k++;
        }

        for(int i=0;i<ar2.length;i++){
            res[k] = ar2[i];
            k++;
        }

        for(int i =0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
}
