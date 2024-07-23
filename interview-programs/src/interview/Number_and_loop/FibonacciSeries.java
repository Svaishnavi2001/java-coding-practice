package interview.Number_and_loop;

public class FibonacciSeries {
    public static void main(String[] args) {

        int n=5;
        int a=0;
        int b=1;
        int nextTerm=0;

        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            nextTerm=a+b;
            a=b;
            b=nextTerm;
        }
    }
}
