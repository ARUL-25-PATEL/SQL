class Solution {

    public int numIslands(char[][] g) {

        int m = g.length;
        int n = g[0].length;
        int count = 0;

        boolean[][] v = new boolean[m][n];

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (g[i][j] == '0' || v[i][j])
                    continue;

                count++;

                v[i][j] = true;
                q.offer(new int[]{i, j});

                while (!q.isEmpty()) {

                    int[] cell = q.poll();

                    int x = cell[0];
                    int y = cell[1];

                    // Up
                    if (x - 1 >= 0 &&
                        g[x - 1][y] == '1' &&
                        !v[x - 1][y]) {

                        v[x - 1][y] = true;
                        q.offer(new int[]{x - 1, y});
                    }

                    // Down
                    if (x + 1 < m &&
                        g[x + 1][y] == '1' &&
                        !v[x + 1][y]) {

                        v[x + 1][y] = true;
                        q.offer(new int[]{x + 1, y});
                    }

                    // Left
                    if (y - 1 >= 0 &&
                        g[x][y - 1] == '1' &&
                        !v[x][y - 1]) {

                        v[x][y - 1] = true;
                        q.offer(new int[]{x, y - 1});
                    }

                    // Right
                    if (y + 1 < n &&
                        g[x][y + 1] == '1' &&
                        !v[x][y + 1]) {

                        v[x][y + 1] = true;
                        q.offer(new int[]{x, y + 1});
                    }
                }
            }
        }

        return count;
    }
}