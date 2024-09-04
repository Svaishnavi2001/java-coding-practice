package interview.number_and_loops;

public class FactorialUsingRecursive {
    public static void main(String[] args) {

        int n=5;
        long res=factorial(n);
        System.out.println(res);
    }
    private static long factorial(int n) {
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
