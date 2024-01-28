package interview.strings;
//VowelsCount
public class VowelsCount {
    public static void main(String[] args) {
        String str="vaishnavi";
        char []charArray = str.toCharArray();

        int res = countVowels(charArray);
        System.out.println(res);

    }

    private static int countVowels(char[] charArray) {
        int count=0;
        for(int i=0;i<charArray.length;i++){
            if(charArray[i] == 'a' || charArray[i]=='e'
            || charArray[i]=='i' ||  charArray[i]=='o' ||charArray[i]=='u' ){
                System.out.println(charArray[i]);
                count++;
            }
        }
        return count++;
    }
}
