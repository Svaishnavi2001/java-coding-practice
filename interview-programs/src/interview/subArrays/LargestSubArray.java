package interview.subArrays;

public class  LargestSubArray {
    public static void main(String[] args) {

        int []ar={1,-2,3,-4,4,5,-6,7,8 };

        printLargestSubArray(ar);
    }
    private static void printLargestSubArray(int[] ar) {

        int maxSum=Integer.MIN_VALUE;
        int start=0,end=0;

        for(int i=0;i<ar.length;i++){
            int currentSum=0;

            for(int j=i;j<ar.length;j++){
                currentSum=currentSum+ar[j];

                if(currentSum>maxSum){
                    maxSum=currentSum;
                    start=i;
                    end=j;
                }
            }
        }
        for(int i=start;i<=end;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
