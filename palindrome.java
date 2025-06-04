public class PalindromeRecursive {
    public static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String testStr = "leel";
        boolean result = isPalindrome(testStr, 0, testStr.length() - 1);
        if (result) {
            System.out.println(testStr + " is a palindrome.");
        } else {
            System.out.println(testStr + " is NOT a palindrome.");
        }
    }