package DP;

public class MinCoin {
    public static void main(String[] args) {
        int [] arr = {10,25};
        int x = 30;
        System.out.println(minCoins(arr,x));

    }
    static int minCoins(int[] coins, int x) {

        // base case
        if (x == 0) return 0;

        int min = Integer.MAX_VALUE;

        for (int coin : coins) {
            if (coin <= x) {
                int subAns = minCoins(coins, x - coin);

                if (subAns != Integer.MAX_VALUE) {
                    min = Math.min(min, subAns + 1);
                }
            }
        }
        return min;
    }
}
