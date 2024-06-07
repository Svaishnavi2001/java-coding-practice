package interview.string_prgs;
// Reverse String

public class P2 {
    public static void main(String[] args) {

//        String s="this is javatpoint";
//        String rev="";
//        for(int i=s.length()-1;i>=0;i--){
//            rev=rev+s.charAt(i);
//        }
//
//        System.out.println(rev);


        String str ="this is javatpoint";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        System.out.println(rev);
    }
}