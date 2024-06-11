package interview.array_prgs;

public class BubbleSort {
    public static void main(String[] args) {

        int[] ar={64,34,25,12,22,11,90};

        System.out.println("Before sorting:");
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }

        for(int i=0;i< ar.length-1;i++){
            for(int j=0;j<ar.length-1-i;j++){

                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println("\nAfter sorting:");
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
