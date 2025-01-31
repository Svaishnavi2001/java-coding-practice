package interview.string_programs;
import java.util.Scanner;
// How To Swap Two String Variables Without Using Third OR Temp Variable In Java?

public class SwappingStrings {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();

        // before sorting
        System.out.println("Before sorting:");
        System.out.println(s1+" ");
        System.out.println(s2+" ");

        // while sorting
        s1=s1+s2;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());

        // after sorting
        System.out.println("After sorting:");
        System.out.println(s1+" ");
        System.out.println(s2+" ");


    }
}
