package aisd.homework8;

import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 2, 1, 2, 3, 4};
        int[] dp = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            int best = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    if (dp[j] + 1 > best) {
                        best = dp[j] + 1;
                    }
                }
            }
            dp[i] = best;
        }
        int maxLen = Arrays.stream(dp).max().orElse(0);
        System.out.println(maxLen);
    }
}