class Solution {
    public boolean isPalindrome(String s) {
        HashMap<Integer, Character> palindrome = new HashMap<>();

        String lowercase = s.toLowerCase();

        String nonAlpha = lowercase.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(nonAlpha);

        int left = 0;
        int right = nonAlpha.length() - 1;

        while (left <= right) {
            if(nonAlpha.charAt(left) != nonAlpha.charAt(right)) {
                return false;
            }

            left += 1;
            right -= 1;
        }

        return true;
    }
}