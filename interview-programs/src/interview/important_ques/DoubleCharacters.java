package interview.important_ques;

public class DoubleCharacters {
    public static void main(String[] args){
         String s = "hello";
        String res= twiceCharacters(s);
        System.out.println(res);

    }
    private static String twiceCharacters(String s){

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            sb.append(ch).append(ch);

            if( i+1<s.length()  && s.charAt(i)==s.charAt(i+1) ){
                sb.append(s.charAt(i+1));
                i++;
            }
        }
       return sb.toString();
    }
}
