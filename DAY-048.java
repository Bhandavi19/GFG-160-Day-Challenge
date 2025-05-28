// Print Anagrams Together
// Problem Statetment : Given an array of strings, return all groups of strings that are anagrams. The strings in each group must be arranged in the order of their appearance in the original array. Refer to the sample case for clarification.
// Examples:
// Input: arr[] = ["act", "god", "cat", "dog", "tac"]
// Output: [["act", "cat", "tac"], ["god", "dog"]]
// Explanation: There are 2 groups of anagrams "god", "dog" make group 1. "act", "cat", "tac" make group 2.


  class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        HashMap<String , ArrayList<String>> hm = new HashMap<>();
        
        for(String s : arr){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            
            hm.computeIfAbsent(sorted , k -> new ArrayList<>()).add(s);
        }
        for(ArrayList<String> s : hm.values()){
            res.add(s);
        }
        return res;
    }
}
