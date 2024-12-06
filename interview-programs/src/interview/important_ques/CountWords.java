package interview.important_ques;

public class CountWords {

    public static void main(String[] args) {

        String s = "Hi how are you";
        int count=0;

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==' '&& s.charAt(i+1)!=' '){
                count++;
            }
        }
        if(s.charAt(0)==' '){
            System.out.println(count);
        }
        else{
            System.out.println(count+1);
        }
        }

    }

