package com.string_manipulation_prgs;

/* s="TaP$@AcaD123"
   o/p= TPADaca

*/

public class Lab9 {
    public static void main(String[] args) {
        String s="TaP$@AcaD123";

       String t1="";
       String t2="";

       for(int i=0;i<s.length();i++){

           char ch=s.charAt(i);
           if(ch>='A' && ch<='Z'){
               t1=t1+ch;
           }
           else if (ch>='a' && ch<='z'){
                     t2=t2+ch;
           }
       }
       String res=t1+t2;
        System.out.println(res);
    }
}
