public class TetrisGrid {
    private boolean[][] grid;
    private int weight;
    private int height;

    public boolean[][] getGrid() {
        return grid;
    }

    public TetrisGrid (boolean[][] grid) {
        this.grid = grid;
        this.height = grid.length;
        this.weight = grid[0].length;
    }

    public void clearRows() {
        int xNow = 0;
        for (int i = 0; i < height; i++) {
            boolean full = true;
            for (int j= 0; j < weight; j++) {
                if(grid[i][j] == false) {
                    full = false;
                    break;
                }
            }
            if (full == false) {
                if (xNow != i) {
                    for (int j = 0; j < weight; j++) {
                        grid[xNow][j] = grid[i][j];
                    }
                }
                xNow++;
            }
        }
        for(int i= xNow; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                grid[i][j] = false;
            }
        }
    }

    public static void main(String[] args) {

    }
}
