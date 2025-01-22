package interview.strings;

public class BinarySearch {
    public static void main(String[] args) {

        int ar[]={2, 5, 8, 12, 16, 23, 38, 45, 56};
        int target=38;
        int res=binarySearching(ar,target);
        System.out.println(res);

    }

    private static int binarySearching(int[] ar,int target) {

        int l=0;
        int h=ar.length-1;

        while(l<=h){
            int mid=l+(h-l)/2;
            if(ar[mid]==target){
                return mid;
            }
            if(ar[mid]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }

        }
        return -1;
    }
}
