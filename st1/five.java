import java.util.*;

class five {

    // YOU HAVE TO WRITE LOGIC HERE
    static void ratMaze(int[][] maze, int i, int j, String path, boolean[][] visited, int n) {
        if(i == n-1 && j == n-1){
            System.out.println(path);
            return;
        }

        if(i<0 || j<0 || i>=n || j>=n || visited[i][j] == true || maze[i][j] == 0){
            return;
        }

        visited[i][j] = true;

        ratMaze(maze, i+1, j, path+"D", visited, n);
        ratMaze(maze, i, j+1, path+"R", visited, n);
        ratMaze(maze, i-1, j, path+"U", visited, n);
        ratMaze(maze, i, j-1, path+"L", visited, n);

        visited[i][j] = false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] maze = new int[n][n];
        boolean[][] visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
                visited[i][j] = false;
            }
        }

        ratMaze(maze, 0, 0, "", visited, n);

        sc.close();
    }
}