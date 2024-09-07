package interview.strings;

public class SwappingAdjacentStrings {
    public static void main(String[] args) {
        
        String s="India is my country";

        String res=swapWords(s);
        System.out.println(res);
    }

    private static String swapWords(String s) {
        String []words=s.split(" ");
        for(int i=0;i<words.length-1;i=i+2){
            String temp=words[i];
            words[i]=words[i+1];
            words[i+1]=temp;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            sb.append(words[i]+" ");
        }
        return sb.toString();
    }
}
