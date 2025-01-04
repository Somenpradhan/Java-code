import java.util.Arrays;
class Sample 
{
    public static void main(String[] args) 
    {
        int[][] mat = {{1, 2}, {3, 4}};
        int r = 1, c = 4;
        int[][] Matrix = reshape(mat, r, c);

        for (int[] row : Matrix) 
        {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] reshape(int[][] mat, int r, int c) 
    {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) 
        {
            return mat;
        }

        int[] Array = new int[m * n];
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) 
            {
                Array[index++] = mat[i][j];
            }
        }

        int[][] Matrix = new int[r][c];
        index = 0;
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                Matrix[i][j] = Array[index++];
            }
        }

        return Matrix;
    }
}
