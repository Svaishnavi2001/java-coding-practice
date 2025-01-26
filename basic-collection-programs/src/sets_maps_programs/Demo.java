package sets_maps_programs;

public class Demo {
    public static void main(String[] args) {

        String str="fear leads to conflicts";

        //String to StringArray
        String[] srtArray=str.split(" ");
        for(String s: srtArray){
            System.out.println(s);
        }
        // String to characterArray
        char[] ch=str.toCharArray();
        for(char character: ch){
            System.out.println(character);
        }
        // String to integerArray
        String s="1,2,3,4,5";
        String[] str1=s.split(",");

       int[] intArray=new int[str1.length];
      for(int i=0;i<str1.length;i++){
          intArray[i]=Integer.parseInt(str1[i]);
       }
      for(int num:intArray){
          System.out.println(num);
      }
    }
}
