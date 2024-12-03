package interview.number_and_loops;

public class ArmStrongNum {
    public static void main(String[] args) {

        int n=153;
        int sum=0;
        int numCopy=n;

        while(n!=0){
            int temp=n%10;
            sum=sum+cube(temp);
            n=n/10;
        }
        if(sum==numCopy){
            System.out.println(numCopy+" "+"is armstrong number");
        }
        else{
            System.out.println(numCopy+" "+"is not armstrong number");
        }
    }

    private static int cube(int temp) {
        int cube=0;
        for(int i=1;i<=temp;i++){
            cube=temp*temp*temp;
        }
        return cube;
    }
}
