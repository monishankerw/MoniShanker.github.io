package org.example.corejava.collection.map.HashMap.logicQuestion;

/*
Group Anagrams
Given an array of strings strs, group the anagrams together. You
can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters
of a different word or phrase, typically using all the original letters
exactly once.
Input: strs = ["eat"
,
"tea"
,
"tan"
,
"ate"
,
"nat"
,
"bat"]
Output: [["bat"],["nat"
,
"tan"],["ate"
,
"eat"
,
"tea"]]
 */



/*
Approach
Sorting Method:

For each string, sort its characters to get the key.
Use this key to group strings that are anagrams of each other.
Hash Map:

Use a HashMap where the key is the sorted string and the value is a list of anagrams (strings).

 */
import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams.groupAnagrams(strs);
        System.out.println(result);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            if (!anagramMap.containsKey(sortedStr)) {
                anagramMap.put(sortedStr, new ArrayList<>());
            }
            
            anagramMap.get(sortedStr).add(str);
        }
        
        return new ArrayList<>(anagramMap.values());
    }
}
