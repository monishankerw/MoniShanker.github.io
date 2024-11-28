package org.example.corejava.string;

public class ReverseString {
    public static void main(String[] args) {
        String rev="";
        String str="testing ";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("Reverse String::"+rev);
    }
}
