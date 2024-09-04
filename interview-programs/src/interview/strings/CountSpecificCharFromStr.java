package interview.strings;
// count occurrence of a  specific character in a string
public class CountSpecificCharFromStr {
    public static void main(String[] args) {

        String str="Hello world";
        char ch='l';

        int count=countSpecificChar(str,ch);
        System.out.println(ch+" "+count+" ");

    }

    private static int countSpecificChar(String str, char ch) {
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
}
