package interview.arrays;

public class FindSpecificElement {

    public static void main(String[] args) {

        int ar[]={1,2,3,4,5,6,7};

        int k=6;

        for(int i=0;i<ar.length;i++){
            if(ar[i]==k){
                System.out.println(i+" ");
            }
        }
    }
}
