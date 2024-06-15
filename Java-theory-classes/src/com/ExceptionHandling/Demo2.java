package com.ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter numerator");
            int a = sc.nextInt();
            System.out.println("Enter denominator");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println(c);
            System.out.println("Enter size");
            int n=sc.nextInt();
            int []arr= new int[n];
            System.out.println("Enter the element ");
            int ele=sc.nextInt();
            System.out.println("Enter the index");
            int index=sc.nextInt();
            arr[index]=ele;
            System.out.println(arr[index]);
        }
        catch (ArithmeticException ae){
            System.out.println("Give non zero denominator");
        }
        catch (NegativeArraySizeException ne){
            System.out.println("size should be positive ");
        }
        catch (InputMismatchException ie){
            System.out.println("Input should be of same type");
        }
        catch (ArrayIndexOutOfBoundsException aie){
            System.out.println("Provide valid index");
        }
//        // Generic catch block
        catch (Exception e){
            System.out.println("Invalid input! Try again");
        }
    }
}
