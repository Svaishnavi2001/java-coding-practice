package interview.string_programs;
/*
      i/p- Tap Academy
      o/p- Academy Tap

 */
public class ReverseString2 {
    public static void main(String[] args) {

        String s = "Tap academy";
        reverseStrings(s);
    }

    private static void reverseStrings(String s) {

        String []words = s.split(" ");
        StringBuilder sb= new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
