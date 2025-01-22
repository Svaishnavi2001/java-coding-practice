package interview.strings;
// smallestword and largestword of string
public class SmallestWordOfString {

    public static void main(String[] args) {

        String s = "Tap academy";

        String []strings = s.split(" ");
        String smallestStr=strings[0];
        for(int i=0;i<strings.length;i++){
            if(strings[i].length()<smallestStr.length()){
                smallestStr=strings[i];
            }
        }
        System.out.println(smallestStr);
         String largestWord=strings[0];
         for(int i=0;i<strings.length;i++){
             if(strings[i].length()>largestWord.length()){
                 largestWord=strings[i];
             }
         }
        System.out.println(largestWord);
    }
}
