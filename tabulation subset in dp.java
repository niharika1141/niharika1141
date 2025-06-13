import java.util.Arrays;

public class isSubsetSumTabulation {

    public static boolean isSubsetSum(int[] arr, int target) {
        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][target + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (arr[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];  
                } else {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                }
            }
        }

        return dp[n][target];
    }

    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int target = 9;

        boolean result = isSubsetSum(arr, target);
        System.out.println("Subset with given sum exists (tabulation): " + result);
    }
}
