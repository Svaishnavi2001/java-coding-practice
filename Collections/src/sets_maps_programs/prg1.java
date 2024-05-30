package sets_maps_programs;
// Removing duplicates
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class prg1 {
    public static void main(String[] args) {

        LinkedHashSet<Character> ls=new LinkedHashSet<Character>();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        for(int i=0;i<s.length();i++){
            ls.add(s.charAt(i));
        }

        System.out.println(ls);
    }
}
