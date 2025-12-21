class IslandPerimeter {

    static int findPerimeterofIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int perim = 0;
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                if (grid[row][col] == 0)
                    continue;

                if (row == 0 || grid[row - 1][col] == 0) // top
                    perim++;
                if (row == r - 1 || grid[row + 1][col] == 0) // bottom
                    perim++;
                if (col == 0 || grid[row][col - 1] == 0) // left
                    perim++;
                if (col == c - 1 || grid[row][col + 1] == 0) // right
                    perim++;
            }
        }

        return perim;
    }

    public static void main(String[] args) {
        // int[][] grid = {
        //         { 0, 1, 0, 0 },
        //         { 1, 1, 1, 0 },
        //         { 0, 1, 0, 0 },
        //         { 1, 1, 0, 0 }
        // };
        int[][] grid = {
              {1,0}
        };
        int perim = findPerimeterofIsland(grid);
  System.out.println("Perimeter of Island :" +perim);
    }
}