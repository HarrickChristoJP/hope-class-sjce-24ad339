import java.util.*;

public class Island {
    public static int ver(int[][] mat, int row, int col) {
        
        if (mat[row - 1][col] == 0 &&
            mat[row + 1][col] == 0 &&
            mat[row][col + 1] == 0 &&
            mat[row][col - 1] == 0)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row_s = sc.nextInt();
        int col_s = sc.nextInt();
        int[][] mat = new int[row_s][col_s];
        int count = 0;

        
        for (int row = 0; row < row_s; row++) {
            for (int col = 0; col < col_s; col++)
                mat[row][col] = sc.nextInt();
        }

        
        for (int row = 1; row < row_s - 1; row++) {
            for (int col = 1; col < col_s - 1; col++) {
                if (mat[row][col] == 1) {
                    int ans = ver(mat, row, col); 
                    if (ans == 1)
                        count++;
                }
            }
        }
        System.out.print(count);
    }





























    
}
