package interview.string_programs;
// check whether substring is present in a given string
public class SubstringInString {
    public static void main(String[] args) {

        String str = "mississippi";
        String str1 = "is";
        int size=str1.length();

        String res=printSubstring(str, str1,size);
        System.out.println(res);

    }

    private static String printSubstring(String str, String str1,int size) {


        for (int i = 0; i <= str.length() - size; i++) {
            String t="";
                for (int j = i; j < i + size; j++) {
                    t = t + str.charAt(j);
                }
                if(t.equals(str1)){
                    return "Yes";
                }
            }

     return "No";
    }
}
