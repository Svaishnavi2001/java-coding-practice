package interview.subArrays;

// Print sum of maximum sized subArray of a given Array.

public class PrintMaximumSizedSubArray {
    public static void main(String[] args) {
       int []ar={1,2,3,4,5,6};
        printAllSubArrays(ar);
    }

    private static void printAllSubArrays(int[] ar) {

        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }

    }
}


