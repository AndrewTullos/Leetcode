class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }
        
        // Store the original number
        int original = x;
        int reversedNum = 0;
        
        // Reverse the number
        while (x > 0) {
            int digit = x % 10;
            // Check for integer overflow
            if (reversedNum > Integer.MAX_VALUE / 10) {
                return false;
            }
            reversedNum = reversedNum * 10 + digit;
            x /= 10;
        }
        
        // Compare original with reversed
        return original == reversedNum;
    }
}