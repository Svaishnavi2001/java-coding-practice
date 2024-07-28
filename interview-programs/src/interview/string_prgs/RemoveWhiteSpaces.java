package interview.string_prgs;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {

        String s = "Remove white spaces";

        s=s.replaceAll("\\s","");
        System.out.println(s);

        String[] strings = s.split(" ");
        for (String str : strings) {
            System.out.print(str);
        }
    }
}

