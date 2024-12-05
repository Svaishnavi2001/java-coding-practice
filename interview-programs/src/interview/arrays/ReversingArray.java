package interview.arrays;

public class ReversingArray {
    public static void main(String[] args) {


        int []ar={1,2,3,4,5,6};

        int start=0,end=ar.length-1;
        while(start<end){
            int temp=ar[start];
            ar[start]=ar[end];
            ar[end]=temp;
            start++;
            end--;
        }

        for(int k=0;k<ar.length;k++){
            System.out.print(ar[k]+" ");
        }
    }
}
