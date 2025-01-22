package interview.strings;

public class ReverseStrings {
    public static void main(String[] args) {

        String s = "Tap academy";
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
