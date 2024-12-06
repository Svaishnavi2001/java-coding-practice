package interview.important_ques;

public class PrintStringPatter {
    public static void main(String[] args){

        String s = "WORLD";

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i%2==0){
                sb.append(String.valueOf(ch).repeat(3)).append("\n");

            }
        }
        String res=sb.toString();
        System.out.println(res);
    }
}