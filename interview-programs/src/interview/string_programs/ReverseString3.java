package interview.string_programs;
/// Reverse words of string
public class ReverseString3 {
    public static void main(String[] args) {

        String s="India is my country";
        reverseWords(s);
    }
    private static void reverseWords(String s) {
        String []str=s.split(" ");
        String t="";
        for(int i=0;i<str.length;i++){ // o/p= aidnI si ym yrtnuoc
            //for(int i=str.length-1;i>=0;i--){  o/p= yrtnuoc ym si aidnI
            t=t+reverseChars(str[i])+" ";
        }
        System.out.println(t);
    }
    private static String reverseChars(String s){
        String  rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        return rev;
    }
}
