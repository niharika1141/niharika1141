public class KnapSack {
    public static int KnapSack(int[] weight, int[] profit, int w, int n) {
        if (n == 0 || w == 0) {
            return 0;
        }
        if (weight[n - 1] > w) {
            return KnapSack(weight, profit, w, n - 1);
        } else {
            int include = profit[n - 1] + KnapSack(weight, profit, w - weight[n - 1], n - 1);
            int exclude = KnapSack(weight, profit, w, n - 1);
            return Math.max(include, exclude);
        }
    }

    public static void main(String[] args) {
        int w = 4;
        int[] profit = {1, 2, 3};
        int[] weight = {4, 5, 1};
        int n = profit.length;

        int result = KnapSack(weight, profit, w, n);
        System.out.println("Output for Test case: " + result);
    }
}
