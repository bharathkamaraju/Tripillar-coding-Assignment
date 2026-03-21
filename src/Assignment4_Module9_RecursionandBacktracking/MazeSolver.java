package Assignment4_Module9_RecursionandBacktracking;


public class MazeSolver {
    static int N;

    public static void main(String[] args) {
        int[][] maze = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 }
        };

        N = maze.length;
        int[][] solution = new int[N][N];

        if (solveMaze(maze, 0, 0, solution)) {
            printSolution(solution);
        } else {
            System.out.println("No path exists!");
        }
    }

    public static boolean solveMaze(int[][] maze, int x, int y, int[][] sol) {
        // Base Case: If we reached the destination
        if (x == N - 1 && y == N - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        // Check if maze[x][y] is a valid move
        if (isSafe(maze, x, y)) {
            // Mark current cell as part of solution path
            sol[x][y] = 1;

            // Move Right
            if (solveMaze(maze, x, y + 1, sol)) return true;

            // Move Down
            if (solveMaze(maze, x + 1, y, sol)) return true;

            // BACKTRACK: If neither move works, unmark this cell
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    public static boolean isSafe(int[][] maze, int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
    }

    public static void printSolution(int[][] sol) {
        for (int[] row : sol) {
            for (int cell : row) {
                System.out.print(" " + cell + " ");
            }
            System.out.println();
        }
    }
}
