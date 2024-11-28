package org.example.corejava.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        String st="aabdsddee";
        String result=removeCharacter(st);
        System.out.println("Remove Duplicate Character:"+result);
    }

    private static String removeCharacter(String st) {
        Set<Character>set=new LinkedHashSet<>();
        for (char ch:st.toCharArray()){
            set.add(ch);
            System.out.println(set);

        }
        StringBuilder sb=new StringBuilder();
        for(char ch:set){
            sb.append(ch);
        }
return sb.toString();
    }
}
