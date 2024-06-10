package sets_maps_programs;

import java.util.TreeSet;

public class RemoveDuplCharFromString {
    public static void main(String[] args) {

        String str = "mississippi";
        char[] charArray = str.toCharArray();

        TreeSet<Character> set = new TreeSet<>();
        for (char ch : charArray) {
            set.add((ch));
        }

//        System.out.println(set);

        StringBuilder sb=new StringBuilder();
        for(char ch: set){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
