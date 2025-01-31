package interview.subArrays;

import java.util.Scanner;

public class LongestPrimeSubArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int ar[]=new int[s];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        longestSubArray(ar);
    }
    private static boolean isPrime(int num){
        if(num==1){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return  true;
    }
    private static void longestSubArray(int[] ar) {

        int maxLength=0;
        int start=0;
        int currentLength=0;
        int currentStart=0;

        for(int i=0;i<ar.length;i++){
            if(isPrime(ar[i])) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    start = currentStart;
                }
            }
                else{
                    currentLength=0;
                    currentStart=i+1;
                }
            }
            if(maxLength>0){
                for(int i = start;i<start+maxLength;i++){
                    System.out.print(ar[i]+" ");
                }
                System.out.println();
            }
            else{
                System.out.println("not found");
            }
        }
    }

