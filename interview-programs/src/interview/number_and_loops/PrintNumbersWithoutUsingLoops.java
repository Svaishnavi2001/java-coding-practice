package interview.number_and_loops;

public class PrintNumbersWithoutUsingLoops {

    public static void main(String[] args) {

        int n=10;
        printNumbers(1,n);
    }

    private static void printNumbers(int i, int n) {
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        printNumbers(i+1,n);
    }
}

