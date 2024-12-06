package interview.important_ques;

public class PrintString {

    public static void main(String[] args) {

        String s = "hello";

        String res=doubleCharacter(s);
        System.out.println(res);
    }
    private static String doubleCharacter(String s){

        char ch[]=s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='h'){
                sb.append("hh");
            }
            else if(ch[i]=='e'){
                sb.append("ee");
            }
            else if(ch[i]=='o'){
                sb.append("oo");
            }
            else {
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}
