package interview.string_manipulation;

/* i/p- world
   o/p- woorrrllllddddd
*/
public class DoubleTheChars {
    public static void main(String[] args) {

        String str="world";
        char []chars=str.toCharArray();

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<chars.length;i++){
            if(chars[i]=='o'){
                sb.append("oo");
            }
            else if(chars[i]=='r'){
                sb.append("rrr");
            }
            else if(chars[i]=='l'){
                sb.append("llll");
            }
            else if(chars[i]=='d'){
                sb.append("ddddd");
            }
            else{
                sb.append(chars[i]);
            }
        }
        String res=sb.toString();
        System.out.println(res);
    }
}
