package interview.number_and_loops;

public class StrongNum {
    public static void main(String[] args) {

        int n=153;
        int sum=0;
        int numCopy=n;

        while(n!=0){
            int temp=n%10;
            sum=sum+factorialOfNum(temp);
            n=n/10;
        }
        if(sum==numCopy){
            System.out.println(numCopy+" "+"is strong number");
        }
        else{
            System.out.println(numCopy+" "+"is not strong number");
        }
    }

    private static int factorialOfNum(int temp) {
        int fact=1;
        for(int i=1;i<=temp;i++){
            fact=fact*i;
        }
        return fact;
    }
}
