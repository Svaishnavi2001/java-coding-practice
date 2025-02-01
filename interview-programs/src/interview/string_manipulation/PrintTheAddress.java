package interview.string_manipulation;

import java.util.*;

public class PrintTheAddress {
    public static void main(String[] args) {

        String s = "laxmi@gmail.com,sneha@gmail.com,vaishnavi@gmail.com";
        String[] str = s.split(",");

        // using set
        Set<String> set = new TreeSet<>();
        for (String string : str) {
            set.add(string);
        }
        System.out.println(set.toString());
        System.out.println();

        // using Arrays
        Arrays.sort(str);

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i] + " ");
        }
    }
}
