MIN CHARS TO ADD FOR PALINDROME
Problem Statement : Given a string s, the task is to find the minimum characters to be added at the front to make the string palindrome.
Note: A palindrome string is a sequence of characters that reads the same forward and backward.
Examples:
Input: s = "abc"
Output: 2
Explanation: Add 'b' and 'c' at front of above string to make it palindrome : "cbabc"

//used lps array to count the number of characters need to be added
class Solution {
  //method to find the lps array
    private static int[] lps(String s){
        int n = s.length();
        int len=0;
        int i=1;
        int lps[] = new int[n];
        lps[0] = 0;
        while(i<n){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len != 0){
                    len = lps[len-1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
    public static int minChar(String s) {
        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();
        
        s = s+"$"+rev;
      //calculating the lps of the concatenated string
        int lps[] = lps(s);
        //return by substracting from the original string length with the last lps element
        return (n - lps[lps.length - 1]);
    }
        
}
