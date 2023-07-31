package first_project;
public class TwoMatrix {
	
	public static void main(String[] args) {
		int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] result = multiplyMatrices(a, b);
        printMatrix(result);
	}
	public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < b.length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
	 public static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int num : row) {
	                System.out.print(num + " ");
	            }
	            System.out.println();
	        }
}
}