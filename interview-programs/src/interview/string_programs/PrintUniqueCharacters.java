package interview.string_programs;

public class PrintUniqueCharacters {
    public static void main(String[] args) {

        String str = "java";

        int count=1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count == 1) {
                    System.out.print(str.charAt(i) + " ");
                }
                count = 1;
            }
        }
            if(count==1){
                System.out.print(str.charAt(str.length()-1)+" ");
            }
        }
    }
