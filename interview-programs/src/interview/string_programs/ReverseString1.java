package interview.string_programs;
// Reverse String

public class ReverseString1 {
    public static void main(String[] args) {

        String s="this is javaTPoint"; //(o/p- tnioPTavaj si siht)
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }

        System.out.println(rev);

        // using stringBuilder class
        String str = "this is javaTPoint"; //(o/p- tnioPTavaj si siht)

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String revStr=sb.toString();
        System.out.println(revStr);

    }
}