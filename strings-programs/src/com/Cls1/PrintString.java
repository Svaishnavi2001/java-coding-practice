package com.Cls1;

public class PrintString {
    public static void main(String[] args) {

        String str="world";
        char []chars=str.toCharArray();

        StringBuilder newString=new StringBuilder();

        for(int i=0;i<chars.length;i++){
            if(chars[i]=='o'){
                newString.append("oo");
            }
            else if(chars[i]=='r'){
                newString.append("rrr");
            }
            else if(chars[i]=='l'){
                newString.append("llll");
            }
            else if(chars[i]=='d'){
                newString.append("ddddd");
            }
            else{
                newString.append(chars[i]);
            }
        }
        System.out.println(newString.toString());
    }
}
