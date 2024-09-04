package interview.arrays;

public class ReversingArray {
    public static void main(String[] args) {


        int []ar={1,2,3,4,5,6};

        int i=0,j=ar.length-1;

        while(i<j){
            int temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
            i++;
            j--;
        }

        for(int k=0;k<ar.length;k++){
            System.out.print(ar[k]+" ");
        }
    }
}
