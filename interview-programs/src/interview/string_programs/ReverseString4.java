package interview.string_programs;
/*
     i/p- Tap Academy
     o/p- paT ymedacA

 */
public class ReverseString4 {
    public static void main(String[] args) {

        String s = "Tap Academy";

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

}

