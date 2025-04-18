// Non Repeating Character
// Problem Statement:Given a string s consisting of lowercase English Letters. Return the first non-repeating character in s.
// If there is no non-repeating character, return '$'.
// Note: When you return '$' driver code will output -1.
// Examples:
// Input: s = "geeksforgeeks"
// Output: 'f'
// Explanation: In the given string, 'f' is the first character in the string which does not repeat.

//used LinkedHashMap for the insertion order
class Solution {
    static char nonRepeatingChar(String s) {
        HashMap<Character,Integer> hm = new LinkedHashMap<>();
        int n = s.length();
        char res = '\0';
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            hm.put(ch , hm.getOrDefault(ch,0)+1);
        }
        for(char ch:hm.keySet()){
            if(hm.get(ch)==1){
                res = ch;
                break;
            }
        }
        if(res == '\0'){
            return '$';
        }
        else{
            return res;
        }
    }
}
