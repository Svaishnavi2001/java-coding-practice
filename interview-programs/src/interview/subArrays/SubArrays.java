package interview.subArrays;


public class SubArrays {
    public static void main(String[] args) {

        int[] ar = {1, 2, 3, 4, 5, 6};

        for (int s = ar.length; s >= 1; s--) {

            for (int i = 0; i <= ar.length - s; i++) {
                for (int j = i; j < i + s; j++) {
                    System.out.print(ar[j] + " ");
                }
                System.out.println();
            }
            break;
        }
        System.out.println();

        String str = "mississippi";

        for (int size = str.length(); size >= 1; size--) {
            String t = "";
            for (int i = 0; i <= str.length() - size; i++) {
                for (int j = i; j < i + size; j++) {
                    t = t + str.charAt(j);
                }
                System.out.println(t);
            }
            break;
        }
    }
}