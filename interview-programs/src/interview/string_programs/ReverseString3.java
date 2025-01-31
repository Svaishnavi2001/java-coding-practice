package interview.string_programs;
/*
     i/p- Tap Academy
     o/p- paT ymedacA

 */
public class ReverseString3 {
    public static void main(String[] args) {

        String s="Tap Academy";
        reverseWords(s);
    }
    private static void reverseWords(String s) {
        String []words=s.split(" ");
        String t="";
        for(int i=0;i<words.length;i++){

            t=t+reverseChars(words[i])+" ";
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
