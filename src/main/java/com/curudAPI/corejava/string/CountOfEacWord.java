package org.example.corejava.string;

public class CountOfEacWord {
    public static void main(String[] args) {
        String str="word is Self ghhj";
        int count=1;
        for(int i=0;i<str.length()-1;i++){
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        System.out.println(count);
    }
}
