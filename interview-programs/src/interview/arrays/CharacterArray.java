package interview.arrays;

public class CharacterArray {
    public static void main(String[] args) {
        String str = "abc";
        String s1 = "ggh";
        char []charArray = str.toCharArray();
        System.out.println(charArray);
        countVowels(charArray);
    }

    private static void countVowels(char[] charArray) {
        for(int i=0;i<charArray.length;i++){
            System.out.println(charArray[i]);
        }
    }
}
