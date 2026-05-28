package aisd.homework7;

public class ex4 {
    public static void main(String[] args) {
        int cols = 3;
        int rows = 3;
        int[][] grid = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] dp = new int[cols][rows];
        dp[0][0] = grid[0][0];
        for (int x = 0; x < cols; x++) {
            for (int y = 0; y < rows; y++) {
                if (x == 0 && y == 0) continue;
                if (x == 0) {
                    dp[y][x] = grid[y][x] + dp[y-1][x];
                }
                else if (y == 0) {
                    dp[y][x] = grid[y][x] + dp[y][x-1];
                }
                else {
                    int fromUp = grid[y][x] + dp[y-1][x];
                    int fromLeft = grid[y][x] + dp[y][x-1];
                    dp[y][x] = fromUp < fromLeft ? fromUp : fromLeft;
                }
            }
        }
        System.out.println(dp[rows-1][cols-1]);
    }
}