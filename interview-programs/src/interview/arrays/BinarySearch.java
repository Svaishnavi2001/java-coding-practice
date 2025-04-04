package interview.arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int ar[]={2, 5, 8, 12, 16, 23, 38, 45, 56};
        int target=38;
        int res=binarySearching(ar,target);
        System.out.println(res);

    }

    private static int binarySearching(int[] ar,int target) {

        int l=0;
        int r=ar.length-1;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(ar[mid]==target){
                return mid;
            }
            if(ar[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }

        }
        return -1;
    }
}
