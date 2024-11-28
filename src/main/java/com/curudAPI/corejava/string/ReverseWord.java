package org.example.corejava.string;

public class ReverseWord {
    public static void main(String[] args) {
        String[] str="Java developer".split(" ");
        String rev="";
        for(int i=str.length-1;i>=0;i--){
            rev=rev+str[i]+" ";
        }
        System.out.println("Reverse String::");
        System.out.println(rev.trim());
    }
}
