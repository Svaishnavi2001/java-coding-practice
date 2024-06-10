package sets_maps_programs;

import java.util.Scanner;
import java.util.TreeSet;

public class RemoveDuplicatesFromStr {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String[] str=s.split(" ");
        TreeSet<String> ts=new TreeSet<>();

        for(String string:str){
            ts.add(string);
        }
        System.out.println(ts);
    }
}
