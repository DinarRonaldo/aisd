package aisd.homework8;

import java.util.HashSet;

public class ex1 {
    public static void main(String[] args) {
        int cols = 3;
        int rows = 3;
        int[][] grid = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        HashSet<Integer>[][] pathSums = new HashSet[cols][rows];
        pathSums[0][0] = new HashSet<>();
        pathSums[0][0].add(grid[0][0]);
        for (int x = 0; x < cols; x++) {
            for (int y = 0; y < rows; y++) {
                if (x == 0 && y == 0) continue;
                pathSums[y][x] = new HashSet<>();
                if (x == 0) {
                    for (int val : pathSums[y - 1][x]) {
                        pathSums[y][x].add(val + grid[y][x]);
                    }
                } else if (y == 0) {
                    for (int val : pathSums[y][x - 1]) {
                        pathSums[y][x].add(grid[y][x] + val);
                    }
                } else {
                    for (int val : pathSums[y - 1][x]) {
                        pathSums[y][x].add(val + grid[y][x]);
                    }
                    for (int val : pathSums[y][x - 1]) {
                        pathSums[y][x].add(grid[y][x] + val);
                    }
                }
            }
        }
        System.out.println(pathSums[rows - 1][cols - 1].size());
    }
}