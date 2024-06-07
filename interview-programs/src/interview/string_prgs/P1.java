package interview.string_prgs;

public class P1 {
    public static void main(String[] args){
        // String to charArray
        String s="How are you";
        char[] charArray=s.toCharArray();
        for(char ch: charArray){
            System.out.print(ch+" ");
        }
        System.out.println();

        // String to string Array
        String str="Hi how are you";
        String[] stringArray=str.split(" ");

        for(String st: stringArray){
            System.out.print(st+" ");
        }
        System.out.println();

        // String to integer Array
        String st="1 2 3 4 5 6";
        String[] strings=st.split(" ");

        int[] intArray=new int[strings.length];
        for(int i=0;i<intArray.length;i++){
            intArray[i]=Integer.parseInt(strings[i]);
        }
        for(int nums: intArray){
            System.out.print(nums+ " ");
        }

    }
}
