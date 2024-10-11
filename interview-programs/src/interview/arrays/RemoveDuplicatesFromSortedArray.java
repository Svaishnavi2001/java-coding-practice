package interview.arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int []ar={1,2,2,3,3,4,5,5,7};

        int []temp=new int[ar.length];
        int j=0;

        for(int i=0;i<ar.length-1;i++) {
            if (ar[i] != ar[i + 1]) {
                temp[j] = ar[i];
                j++;
            }
        }
        temp[j] = ar[ar.length - 1];

        for(int k=0;k<temp.length;k++){
            System.out.print(temp[k]+" ");
        }
        System.out.println();
    }
}
