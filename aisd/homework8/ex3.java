package aisd.homework8;

public class ex3 {
    public static void main(String[] args) {
        int[][] graph = new int[][]{
                {0,0,1,1},
                {0,0,0,0},
                {1,0,0,1},
                {1,0,1,0}
        };
        int edgeCount = 0;
        for (int[] row : graph) {
            for (int val : row) {
                if (val == 1) {
                    edgeCount += 2;
                }
            }
        }
        int minSpanningEdges = edgeCount / 2 - 1;
        int removed = edgeCount / 2 - minSpanningEdges;
        System.out.println(removed);
    }
}