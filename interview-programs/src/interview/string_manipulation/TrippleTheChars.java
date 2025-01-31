package interview.string_manipulation;
/*
     i/p- WORLD
     o/p- WWW
          RRR
          DDD
 */
public class TrippleTheChars {
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