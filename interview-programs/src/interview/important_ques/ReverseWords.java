package interview.important_ques;

public class ReverseWords {
    public static void main(String[] args) {

        String s = "  Hello World from Java";
     //   reverseWords(s);
        String res=reverseWords(s);
        System.out.println(res);
    }
    private static String reverseWords(String s){

        String words[] = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String word:words){
            sb.append(new StringBuilder(word).reverse()).append(" ");
        }
           return sb.toString().trim();
    }
//    private static void reverseWords(String s){
//        String words[]=s.split(" ");
//
//        String t="";
//        for(String word: words){
//            t=t+reverseWord(word)+" ";
//        }
//        System.out.println(t.trim());
//    }
//    private static String reverseWord(String word){
//
//        String rev="";
//        for(int i=word.length()-1;i>=0;i--){
//            rev=rev+word.charAt(i);
//        }
//        return rev;
    }

