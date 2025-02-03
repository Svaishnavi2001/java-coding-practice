package interview.string_manipulation;
/*
 Write a code to print the output if,
 A word contains no vowel then reverse the word.
 A word contains 1 vowel then replace a vowel with next vowel.
 A word contains 2 vowels then replace vowels with next vowels.
 A word contains 3 vowels then replace vowels with previous consonants.
 if it contains more than 3 vowels, keep it unchanged.

 */
public class StringTestCases {
    public static void main(String[] args) {
        String s = "try bat boat beautiful elephant zoo";
        String []words=s.split(" ");

        for(String  word: words){
            int vowelCount=countVowels(word);

            if(vowelCount==0){
                System.out.println("No vowel:"+ reverseWord(word));
            }
            else if(vowelCount==1){
                System.out.println("1 vowel:"+ replaceVowelWithNextVowel(word));
            }
            else if(vowelCount==2){
                System.out.println("2 vowels:"+ replaceAllVowelsWithNextVowels(word));
            }
            else if(vowelCount==3){
                System.out.println("3 vowels:"+ replaceAllVowelsWithPreviousConsonants(word));
            }
            else{
                System.out.println("More than 3 vowels:"+ word);
            }
        }
    }

    // Reverse the word
    private static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    // Replace the 1 vowel with the next vowel
    private static String replaceVowelWithNextVowel(String word) {
        char []vowels ={'a','e','i','o','u'};
        StringBuilder sb = new StringBuilder(word);

        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(isVowel(ch)){
                sb.setCharAt(i, getNextVowel(ch,vowels));
                break;
            }
        }
        return sb.toString();
    }

    //Replace all 2 vowels with the next vowels
    private static String replaceAllVowelsWithNextVowels(String word) {
        char []vowels= {'a','e','i','o','u'};
        StringBuilder sb = new StringBuilder(word);

        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(isVowel(ch)){
                sb.setCharAt(i, getNextVowel(ch, vowels));

            }
        }
        return  sb.toString();
    }

    //Replace all 3 vowels with the previous consonants
    private static String replaceAllVowelsWithPreviousConsonants(String  word) {
        StringBuilder sb = new StringBuilder(word);

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (isVowel(ch)) {
                sb.setCharAt(i, getPreviousConsonant(ch));

            }
        }
        return  sb.toString();
    }

    //Get the next vowel
    private static char getNextVowel(char ch, char[] vowels) {
        ch=Character.toLowerCase(ch);

        for(int i=0;i<vowels.length;i++){
            if(vowels[i]==ch){
                return  i==vowels.length-1 ? vowels[0]: vowels[i+1];
            }
        }
        return  ch;
    }

    //Get the previous consonant
    private static char getPreviousConsonant(char ch){
        ch=Character.toLowerCase(ch);
        char prev=ch;

        for(char c=(char)(ch-1);c>='a';c--){
            if(!isVowel(c)&& Character.isLetter(c)){
                prev=c;
                break;
            }
        }
       return  prev;
    }

    // Count the number of vowels in a word
    private static int countVowels(String word) {
        int count=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(isVowel(ch)){
                count++;
            }
        }
        return count;
    }

    // Check if a character is a vowel
    private static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) !=-1;
    }
}
