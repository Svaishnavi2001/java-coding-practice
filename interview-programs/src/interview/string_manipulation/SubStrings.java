package interview.string_manipulation;

public class SubStrings {
    public static void main(String[] args) {

        String s = "Abcdefghijk";
        int N=3;

        String string = s.toLowerCase();

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<string.length();i++){
            char ch=string.charAt(i);
            sb.append(ch);

            if((i+1)% N ==0){
                sb.append("\n");
            }
        }
        String res=sb.toString();
        System.out.println(res);



    }
}
