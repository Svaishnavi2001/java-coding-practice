package interview.string_prgs;

import java.util.Arrays;

public class SortingOfString {
    public static void main(String[] args) {

        String str="listen";

        char[] chars=str.toCharArray();

        for(char ch:chars){
            System.out.print(ch+" ");
        }

        Arrays.sort(chars);
        System.out.println();

        StringBuilder sb=new StringBuilder();
        for(char ch:chars){
            sb.append(ch);
        }

        System.out.println(sb.toString());

    }
}
