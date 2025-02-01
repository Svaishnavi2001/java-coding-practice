package interview.string_programs;

public class LeftAndRightRotationOfString {
    public static void main(String[] args) {
        String s = "abcdef";
        int positions=2;
        System.out.println(s);

        String leftRotated=rotateLeft(s,positions);
        System.out.println(leftRotated);

        String rightRotated=rotateRight(s,positions);
        System.out.println(rightRotated);
    }
    private static String rotateLeft(String s, int positions){

        int n=s.length();
        positions=positions%n;

        return s.substring(positions)+s.substring(0,positions);

    }
    private static String rotateRight(String s, int positions){

        int n=s.length();
        positions=positions%n;

        return s.substring(n-positions)+s.substring(0,n-positions);
    }
}
