package interview.number_and_loops;

import java.util.Scanner;

public class SumOfEvenNumbersWithinRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start=sc.nextInt();
        int end=sc.nextInt();

        int sum=0;
        for(int i=start;i<=end;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
