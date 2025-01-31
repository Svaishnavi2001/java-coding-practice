package interview.string_programs;
/*
   i/p-   TapAcademy
   o/p-   ymedacApaT

 */
public class ReverseString1 {
    public static void main(String[] args) {

        String s="TapAcademy";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }

        System.out.println(rev);

        // using stringBuilder class
        String str = "TapAcademy";

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String revStr=sb.toString();
        System.out.println(revStr);

    }
}