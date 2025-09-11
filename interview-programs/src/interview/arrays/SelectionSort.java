package interview.arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int ar[]={64,34,25,12,22,11,90};

        System.out.println("Before Sorting: ");
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        for(int  i=0;i<ar.length-1;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]>ar[j]){
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        System.out.println("\nAfter Sorting: ");
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
