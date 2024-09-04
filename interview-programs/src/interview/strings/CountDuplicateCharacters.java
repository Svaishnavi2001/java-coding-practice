package interview.strings;

public class CountDuplicateCharacters {
    public static void main(String[] args) {

        String str="vaishnavi";
        char[] charArray=str.toCharArray();

        int count=1;
        for(int i=0;i< charArray.length-1;i++){
            if(charArray[i]==charArray[i+1]){
                count++;
            }
            else{
                if(count==2){
                    System.out.println(charArray[i]+" ");
                }
                count=1;
            }
        }
        System.out.println(charArray[charArray.length-1]+" ");
    }
}
