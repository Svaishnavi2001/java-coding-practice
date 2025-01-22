package com.string_manipulation_prgs;

/*   S="T2ap1Acad#3"
     O/p= TapAcad6

  */

public class Lab10 {
    public static void main(String[] args) {

        String s="T2ap1Acad#3";

        String t1="";
        int  sum=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
                     t1=t1+ch;
            }
            else if(ch>='0' && ch<='9'){
                sum=sum+(ch-48);
            }
        }
        String res=t1+sum;
        System.out.println(res);
    }
}
