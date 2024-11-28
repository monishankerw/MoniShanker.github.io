package org.example.corejava.string;

public class PalindromeString {
    public static void main(String[] args) {
        String str="madam";
        String rev="";
        String org_str=str;
        for (int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(org_str.equals(str)){
            System.out.println("Palindrome String");
        }else {
            System.out.println("Not Palindrome String");
        }
    }
}
