public class CharGrid {
   private char[][] grid;

    public char[][] getGrid() {
        return grid;
    }

    public void setGrid(char[][] grid) {
        this.grid = grid;
    }

    public int charArea(char ch) {
        int imin = grid.length + 1, imax = -1, jmin = Integer.MAX_VALUE, jmax = -1;
        boolean tmp = false;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == ch)
                {
                    imin = Math.min(imin, i);
                    jmin = Math.min(jmin, j);
                    imax = Math.max(imax, i);
                    jmax = Math.max(jmax, j);
                    tmp = true;
                }
            }
        }

        if (tmp == false) {
           return 0;
        } else {
            return (imax - imin + 1) * (jmax - jmin + 1);
        }

    }

    public static int armLen(char[][] grid, int r, int c, int dr, int dc, char ch) {
        int n = grid.length, m = grid[0].length;
        int len = 0, i = r + dr, j = c + dc;
        while (i >= 0 && i < n && j >= 0 && j < m && grid[i][j] == ch) {
            len++;
            i += dr;
            j += dc;
        }
        return len;
    }

    public int countPlus() {
        int n = grid.length;
        if (n == 0) return 0;
        int m = grid[0].length;

        int count = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                char ch = grid[r][c];
                if (Character.isWhitespace(ch)) continue;

                int up    = armLen(grid, r, c, -1, 0, ch);
                int down  = armLen(grid, r, c,  1, 0, ch);
                int left  = armLen(grid, r, c,  0,-1, ch);
                int right = armLen(grid, r, c,  0, 1, ch);

                if (up > 0 && up == down && up == left && up == right) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
