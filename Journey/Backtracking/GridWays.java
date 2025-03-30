package Journey.Backtracking;

public class GridWays {
    
    public static int gridWays(int i, int j, int m, int n) {
        if(i == m - 1 || j == n - 1) {
            return 1;
        } else if(i == m || j == n) {
            return 0;
        }
        int way1 = gridWays(i + 1, j, m, n);
        int way2 = gridWays(i, j + 1, m, n);
        return way1 + way2;
    }
    public static void main(String[] args) {
        int m = 3, n = 3;
        int res = gridWays(0, 0, m, n);
        System.out.println("Total Number of Ways Are: " +res);
    }
}
