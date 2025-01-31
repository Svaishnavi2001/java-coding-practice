package interview.string_programs;
// searching a  specific character from a string
public class SearchCharacterFromString {
    public static void main(String[] args) {

        String str= "matrix";
        char ch='t';

       int index= searchCharacter(str,ch);
       if(index!=-1){
           System.out.println(ch+" "+ index+" ");
       }
       else{
           System.out.println(ch+" "+ index+"not found");
       }
    }

    private static int   searchCharacter(String str, char ch) {

       for(int i=0;i< str.length();i++){

            if(str.charAt(i)==ch){
                return i;// gives index of character
            }
        }
       return -1; // if character is not  found
    }
}
