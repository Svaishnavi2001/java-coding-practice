package interview.pattern_prg;

public class Pat7 {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            for (int k = 1; k <= 6 - i + 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        for (int i = 1; i <= 6; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 5;j >=i; j--) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}