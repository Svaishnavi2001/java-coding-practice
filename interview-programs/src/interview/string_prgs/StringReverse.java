package interview.string_prgs;
// Reverse String

public class StringReverse {
    public static void main(String[] args) {
        String s="this is javaTPoint";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }

        System.out.println(rev);

        // using stringBuilder class
        String str ="this is javaTPoint";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev1 = sb.toString();
        System.out.println(rev1);

    }
}