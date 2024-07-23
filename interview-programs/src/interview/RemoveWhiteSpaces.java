package interview;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {

        String s = "Remove white spaces";

        s=s.replaceAll("\\s","");
        System.out.println(s);

        /*char[] ch=s.toCharArray();
        for(char c:ch){
            System.out.println(c);
        }*/
        System.out.println();

        String[] strings = s.split(" ");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

