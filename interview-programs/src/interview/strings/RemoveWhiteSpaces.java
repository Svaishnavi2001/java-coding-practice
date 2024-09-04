package interview.strings;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {

        String str = "Remove white spaces";

        str=str.replaceAll("\\s","");
        System.out.println(str);

        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.print(string);
        }
    }
}

