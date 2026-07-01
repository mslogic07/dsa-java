import java.util.*;

public class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        // 0 = empty, 1 = guard, 2 = wall, 3 = guarded

        for (int[] g : guards)
            grid[g[0]][g[1]] = 1;
        for (int[] w : walls)
            grid[w[0]][w[1]] = 2;

        int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}}; // up, down, left, right

        for (int[] g : guards) {
            for (int[] dir : directions) {
                int r = g[0] + dir[0];
                int c = g[1] + dir[1];

                while (r >= 0 && r < m && c >= 0 && c < n && grid[r][c] != 1 && grid[r][c] != 2) {
                    if (grid[r][c] == 0)
                        grid[r][c] = 3; // mark as guarded
                    r += dir[0];
                    c += dir[1];
                }
            }
        }

        int unguarded = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0)
                    unguarded++;
            }
        }
        return unguarded;
    }

    // Optional: local test (ignored by online judge)
    public static void main(String[] args) {
        Solution obj = new Solution();
        int m = 4, n = 6;
        int[][] guards = {{0,0},{1,1},{2,3}};
        int[][] walls = {{0,1},{2,2},{1,4}};
        System.out.println(obj.countUnguarded(m, n, guards, walls)); 
    }
}
