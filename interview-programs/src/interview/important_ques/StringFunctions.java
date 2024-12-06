package interview.important_ques;

public class StringFunctions {
    public static void main(String[] args) {

        String s = "Hello World!";

        System.out.println(s.length());

        String s1[]=s.split(",");
        for(int i=0;i<s1.length;i++) {
            System.out.println(s1[i]+" ");
        }

        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]+" ");
        }
        System.out.println();
        String  s4=s.replaceAll("\\s","");
        System.out.println(s4);

        String s2=s.toLowerCase();
        System.out.println(s2);

        String s3=s.toUpperCase();
        System.out.println(s3);

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s5=sb.toString();
        System.out.println(s5);

        sb.append("!!");
        String s6=sb.toString();
        System.out.println(s6 );




    }
}
