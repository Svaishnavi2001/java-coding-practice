package interview.string_prgs;

public class P1 {

    public static void main(String[] args) {

        String s = "my name is uuk";
        String[] strings = s.split(" ");
        int max=0;
        String output = null;
        for (int i = 0; i < strings.length; i++) {

            int var=strings[i].length();
            max = Math.max(max, var);
            if(var>= max){
                output = strings[i];
            }
        }
        System.out.println(output);
    }
}