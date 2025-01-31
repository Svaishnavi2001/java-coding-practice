package interview.string_programs;
// Palindrome or not
public class PalindromeOrNot {

    public static void  main(String[] args) {

        String s="nitin";

        boolean res= palindrome(s);
        System.out.println(res);

    }
    private static boolean palindrome(String s) {

        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;

       }
    }


