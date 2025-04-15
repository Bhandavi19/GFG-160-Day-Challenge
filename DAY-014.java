// Implement Atoi
// Problem Staetement:Given a string s, the objective is to convert it into integer format without utilizing any built-in functions. Refer the below steps to know about atoi() function.
// Cases for atoi() conversion:
// Skip any leading whitespaces.
// Check for a sign (‘+’ or ‘-‘), default to positive if no sign is present.
// Read the integer by ignoring leading zeros until a non-digit character is encountered or end of the string is reached. If no digits are present, return 0.
// If the integer is greater than 231 – 1, then return 231 – 1 and if the integer is smaller than -231, then return -231.
// Examples:
// Input: s = "-123"
// Output: -123
// Explanation: It is possible to convert -123 into an integer so we returned in the form of an integer


class Solution {
    public int myAtoi(String s) {
        int n=s.length();
        int sign=1 , i=0 , result=0;
        while(i<n && s.charAt(i) == ' '){
            i++;
        }
        if(i<n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            if(s.charAt(i) == '-'){
                sign=-1;
            }
            i++;
        }
        while(i<n && s.charAt(i)>='0' && s.charAt(i)<='9'){
            if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && s.charAt(i)-'0'>7)){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = 10*result + (s.charAt(i++) - '0');//converting into integer with the help of ASCII value and adding it to result
        }
        return sign*result;
    }
}
