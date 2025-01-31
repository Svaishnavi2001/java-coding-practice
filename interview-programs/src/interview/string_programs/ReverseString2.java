package interview.string_programs;

public class ReverseString2 {
    public static void main(String[] args) {

        String s = "Tap academy"; //(o/p - Academy Tap)
        reverseStrings(s);
    }

    private static void reverseStrings(String s) {

        String []str = s.split(" ");
        StringBuilder sb= new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            sb.append(str[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
