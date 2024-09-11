package interview.strings;

public class ReverseWordsOfString {
    public static void main(String[] args) {

        String s="India is my country";
        reverseWords(s);
    }
    private static void reverseWords(String s) {
        String []words=s.split(" ");
        String t="";
        for(String word: words){
           t=t+reverseWord(word)+" ";
        }
        System.out.println(t);
    }
    private static String reverseWord(String s){
        String  rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        return rev;
    }
}
