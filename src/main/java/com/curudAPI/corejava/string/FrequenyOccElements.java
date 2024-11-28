package org.example.corejava.string;

import java.util.HashMap;
import java.util.Map;

public class FrequenyOccElements {
    public static void main(String[] args) {
        String str="Java Developer";
        Map<Character,Integer> map=new HashMap<>();
        char[] ch=str.toCharArray();
        for(char value:ch){
            if(Character.isAlphabetic(value)){
                map.put(value,map.getOrDefault(value,0)+1);
            }
        }
        System.out.println(map);
    }
}
