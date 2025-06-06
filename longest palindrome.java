class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) return "";

        String result = s.substring(0, 1); // Start with 1st char as the longest

        for (int center = 0; center < n; center++) {
            // Check for odd-length palindromes (single center)
            result = expandAndUpdate(s, center, center, result);
            // Check for even-length palindromes (two centers)
            result = expandAndUpdate(s, center, center + 1, result);
        }

        return result;
    }

    // Helper function to expand around center and update result
    private String expandAndUpdate(String s, int left, int right, String currentBest) {
        int n = s.length();

        // Expand as long as characters match and within bounds
        while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        // Substring from left+1 to right-1 is the palindrome
        String newPalindrome = s.substring(left + 1, right);

        // Update if new one is longer
        if (newPalindrome.length() > currentBest.length()) {
            return newPalindrome;
        } else {
            return currentBest;
        }
    }
}