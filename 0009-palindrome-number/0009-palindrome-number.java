class Solution {
    public boolean isPalindrome(int x) {

        // Turn int to str
        String str = Integer.toString(x);

        // Reverse str
        StringBuilder reversedString = new StringBuilder(str);
        reversedString.reverse();

        // Iterate through each string to compare indicies
        for (int i = 0; i < str.length(); i++) {
            System.out.println(i);

             if (str.charAt(i) != reversedString.charAt(i)) {
                return false;
            }

        }
        return true;
    }
}