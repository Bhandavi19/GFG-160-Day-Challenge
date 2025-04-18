// Anagram
// Problem Statement:Given two strings s1 and s2 consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, "act" and "tac" are an anagram of each other. Strings s1 and s2 can only contain lowercase alphabets.
// Note: You can assume both the strings s1 & s2 are non-empty.
// Examples :
// Input: s1 = "geeks", s2 = "kseeg"
// Output: true
// Explanation: Both the string have same characters with same frequency. So, they are anagrams.

  //Used HashMap for the frequency count of each element and to compare the bothe strings
class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
        HashMap<Character , Integer> hm1 = new HashMap<>();
        HashMap<Character , Integer> hm2 = new HashMap<>();
        
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            hm1.put(ch , hm1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s2.length();i++){
            char sh = s2.charAt(i);
            hm2.put(sh , hm2.getOrDefault(sh,0)+1);
        }
        if(hm1.size() != hm2.size()){
            return false;
        }
        for(char ch:hm1.keySet()){
            if(!hm2.containsKey(ch)){
                return false;
            }
            if(!hm1.get(ch).equals(hm2.get(ch))){
                return false;
            }
        }
        return true;
    }
}
