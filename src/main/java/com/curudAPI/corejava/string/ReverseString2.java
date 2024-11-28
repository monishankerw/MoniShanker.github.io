package org.example.corejava.string;

public class ReverseString2 {
    public static void main(String[] args) {
        String str="Developer";
        String rev=reverseStr(str);
        System.out.println("Reverse String:"+rev);
    }

    private static String reverseStr(String str) {
        StringBuilder x=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            x.append(str.charAt(i));
        }
        return x.toString();
    }
}
