package interview.arrays;

public class LeftAndRightRotationOfArray {
    public static void main(String[] args) {

        int ar[]={1,2,3,4,5,6,7};
        int positions=2;
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        rotateLeft(ar,positions);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        rotateRight(ar,positions);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
    private static void reverseArray(int[] ar,int start,int end) {

        while(start<end){
            int temp=ar[start];
            ar[start]=ar[end];
            ar[end]=temp;
            start++;
            end--;
        }
    }
    private static void rotateLeft(int ar[],int positions){

        int n=ar.length;
        positions=positions%n;
        reverseArray(ar,0,positions-1);
        reverseArray(ar,positions,n-1);
        reverseArray(ar,0,n-1);

    }
    private static void rotateRight(int ar[],int positions){

        int n=ar.length;
        positions=positions%n;
        reverseArray(ar,0,n-positions-1);
        reverseArray(ar,n-positions,n-1);
        reverseArray(ar,0,n-1);

    }
}
